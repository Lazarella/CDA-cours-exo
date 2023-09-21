export class pokemon{
    contructor(id,name,img, height, weight ){
        this.id = id;
        this.img = img; 
        this.name = name;
        this.height = height; 
        this.weight = weight; 
    }
    display(img, name, height, weight){
        const showcase = document.querySelector('#screen')

        const pokemonImg = document.createElement('img')
        pokemonImg.setAttribute('src', this.img)
        showcase.innerHTML(pokemonImg)

        const caption = querySelector('#description')
        const pokemonName = document.createElement('h4')
        pokemonName.textContent = this.name
        caption.innerHTML(pokemonName)

        const pokemonHeight = document.createElement('p')
        pokemonHeight.textContent = this.height
        caption.innerHTML(pokemonHeight)

        const pokemonWeight = document.createElement('p')
        pokemonWeight.textcontent = this.weight
        caption.innerHTML(pokemonWeight)
    }
}