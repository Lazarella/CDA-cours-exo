use("hopital");

// db.patients.insertMany([
//     {
//         firstname: "Mohamed",
//         lastname : "Deloin",
//         age: 30,
//         history: [
//             {
//                 desease: "rhume", 
//                 treatment : "sirop"
//             },
//             {
//                 desease: "grippe", 
//                 treatment : "anti-biotique"
//             }
//         ]
//     },
//     {
//         firstname: "Sarah",
//         lastname : "Cleppard",
//         age: 27,
//         history: [
//             {
//                 desease: "Coqueluche", 
//                 treatment : "sirop"
//             },
//             {
//                 desease: "luxation", 
//                 treatment : "anti-inflamatoire"
//             }
//         ]
//     },
//     {
//         firstname: "Melanie",
//         lastname : "Froissard",
//         age: 45,
//         history: [
//             {
//                 desease: "Conjonctivite", 
//                 treatment : "Collyre"
//             }
//         ]
//     }
// ]);

//db.patients.find(); 

// db.patients.update({firstname: "Melanie"}, {$set:{age:46, lastname: "Pratuis", history:[{
//     desease: "Eczema", 
//     treatment : "crême"
// }]}});

//db.patients.find({firstname: "Melanie"});

// db.patients.find({age:{$gte :29}}); 

db.patients.deleteMany({"history.desease":"rhume"}); 
