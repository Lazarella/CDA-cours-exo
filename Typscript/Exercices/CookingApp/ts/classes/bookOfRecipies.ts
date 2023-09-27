export class BookOfRecipe {
    private _recipesList: any[]; 

    constructor(recipesList: any[]) {
        this._recipesList = recipesList;
    }

    get recipesList(): any[] {
        return this._recipesList;
    }

    set recipesList(value: any[]) {
        this._recipesList = value;
    }
    filterByCookTime(cookTimeInput: string): boolean { //find my recipes by cooking Time
        for (let recipe of this._recipesList) {
            if (recipe.cookTime === cookTimeInput) {
                console.log("Le temps de cuisson est " + recipe.cookTime);
                return true;
            }
        }
        return false; 
    }
    findRecipes(){ // Methode to find recipies using filters
        }
    }
