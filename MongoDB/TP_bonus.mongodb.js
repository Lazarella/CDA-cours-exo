// TP Bonus

use("tp_bonus"); 

// 1. Quels sont les sportifs (identifiant, nom et prénom) qui ont un âge entre 20 et 30 ans ?

// db.sportif.aggregate([
//     {
//     $match: {
//         Age: { $gte: 20, $lte: 30 }
//     }
//     },
//     {
//     $project: {
//         _id: 0,
//         IdSportif: 1,
//         Nom: 1,
//         Prenom: 1
//     }
//     }
// ])

// 2. Quels sont les gymnases de ville “Villetaneuse” ou de “Sarcelles” qui ont une surface de plus de 400 m2 ?

// db.gymnase.aggregate([
//     {
//     $match: {
//         $or: [
//             { Ville: { $regex: "Villetaneuse", $options: "i" } },
//             { Ville: { $regex: "Sarcelles", $options: "i" } }
//         ],
//         Surface: { $gte: 400 }
//     }
//     }
// ])

// 3. Quels sont les sportifs (identifiant et nom) qui pratiquent du handball ?

// db.sportif.find(
//     {
//     "Sports.Jouer": "Hand ball"
//     },
//     {
//     IdSportif: 1,
//     Nom: 1,
//     }
// )

// 4. Quels sportifs (identifiant et nom) ne pratiquent aucun sport ?

// db.sportif.find(
//     {
//     "Sports.Jouer": null
//     },
//     {
//         IdSportif: 1,
//         Nom: 1,
//         }
// )

// 5. Quels gymnases n’ont pas de séances le dimanche ?

// NE FONCTIONNE PAS 

// db.gymnase.find({
//         "Seances.Jour": { $not: { $regex: /Dimanche/i } }
// })

// 6. Quels gymnases ne proposent que des séances de basket ball ou de volley ball ?

// db.gymnase.aggregate([
//     {
//         $match: {
//         "Seances.Libelle": {
//         $all: ["Basket ball", "Volley ball"]
//         }
//     }
//     }
// ])

// 7. Quels sont les entraîneurs qui sont aussi joueurs ?

//NE FONCTIONNE PAS 

// db.sportif.find(
//     {
//         Sports: { $all: ["Jouer", "Entrainer"] }
//     },
//     {
//         Nom: 1
//     }
// )

// 8. Pour le sportif “Kervadec” quel est le nom de son conseiller ?

// db.sportif.aggregate([
//     {
//         $match: { Nom: "KERVADEC" }
//     },
//     {
//         $lookup: {
//         from: "sportif",
//         localField: "IdSportifConseiller",
//         foreignField: "IdSportif",
//         as: "conseiller"
//         }
//     },
//     {
//         $project: {
//         _id: 0,
//         Nom: 1,
//         Conseiller: { $arrayElemAt: ["$conseiller.Nom", 0] }
//         }
//     }
// ])

// 9. Quelle est la moyenne d’âge des sportives qui pratiquent du basket ball ?

// db.sportif.aggregate([
//     {
//         $match:{
//             "Sports.Jouer": { $regex: "basket ball", $options: "i" }
//             }
//         }, 
//         {
//         $group:{
//             _id: null,
//             moyenneAge: {$avg: "$Age"}}
//         } 
// ])

// 10.Quels entraîneurs n’entraînent que du hand ball ou du basket ball ?

// db.sportif.aggregate([
//     {
//       $match: {
//         $or: [
//           {
//             "Sports.Entrainer": /^basket ball$/i
//           },
//           {
//             "Sports.Entrainer": /^hand ball$/i
//         }
//         ],
//         "Sports.Entrainer": { $nin: [/^(?!basket ball$|hand ball$)/i] }
//     }
//     }
// ])

// 11. Pour chaque sportif donner le nombre de sports qu’il arbitre?

// db.sportif.aggregate([
//     {
//         $unwind: "$Sports.Arbitrer"
//     },
//     {
// $group: {
//         _id: "$_id",
//         nombreDeSportsArbitres: { $sum: 1 }
//     }
//     }
// ])



