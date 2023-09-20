let pageContent = document.getElementById('pageContent');
let pictInfon = document.getElementById("pictInfo");
let rawImage = '[{"filename": "rainbow-kittens-1.jpg", "title": "Curious Kitten", "author": "Lazare", "aesthetic": "Lowbrow"},{"filename": "rainbow-kittens-2.jpg", "title": "Playful Kittens", "author": "Lazare", "aesthetic": "Lowbrow"},{"filename": "rainbow-kittens-3.jpg", "title": "Cats in Wonderland", "author": "Lazare", "aesthetic": "Lowbrow"},{"filename": "rainbow-kittens-4.jpg", "title": "Whisker Wonderland", "author": "Lazare", "aesthetic": "Lowbrow"},{"filename": "rainbow-kittens-5.jpg", "title": "Dreaming of Cats", "author": "Lazare", "aesthetic": "Lowbrow"},{"filename": "rainbow-kittens-6.jpg", "title": "Feline Fantasy", "author": "Lazare", "aesthetic": "Lowbrow"}]';

let images = JSON.parse(rawImage);
console.log(images);

let randomImage = images[Math.floor(Math.random()*images.length)];
console.log(randomImage);

pageContent.style.backgroundImage = `url(./Asset/${randomImage.filename})`;
