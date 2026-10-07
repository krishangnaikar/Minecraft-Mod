import json
from pathlib import Path
import pytest

ROOT = Path(__file__).resolve().parents[1] / 'src/main/resources'
RECIPES = list((ROOT / 'data/mccourse/recipes').glob('*.json'))

@pytest.mark.parametrize('file', RECIPES, ids=lambda p:p.name)
def test_recipe_ingredients_and_outputs_are_valid(file):
    recipe = json.loads(file.read_text())
    if recipe['type'] == 'minecraft:crafting_shaped':
        pattern = recipe['pattern']
        assert 1 <= len(pattern) <= 3
        assert len({len(row) for row in pattern}) == 1
        assert 1 <= len(pattern[0]) <= 3
        symbols = set(''.join(pattern)) - {' '}
        assert symbols == set(recipe['key'])
        for ingredient in recipe['key'].values():
            assert ':' in ingredient.get('item', ingredient.get('tag',''))
    result = recipe['result']
    if isinstance(result, dict):
        assert ':' in result['item']
        assert 1 <= result.get('count',1) <= 64
    else:
        assert ':' in result

def test_language_entries_cover_primary_items():
    language = json.loads((ROOT / 'assets/mccourse/lang/en_us.json').read_text())
    assert language['item.mccourse.harcaduim']
    assert language['block.mccourse.harcaduim_block']
