package rustic.compat.jei;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import rustic.common.crafting.CrushingTubRecipe;

public class CrushingTubRecipeWrapper extends BlankRecipeWrapper {

	public CrushingTubRecipe recipe = null;
	
	public CrushingTubRecipeWrapper(CrushingTubRecipe recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInput(ItemStack.class, recipe.getInput());
		ingredients.setOutput(FluidStack.class, recipe.getResult());
		ingredients.setOutput(ItemStack.class, recipe.getByproduct());
	}

}
