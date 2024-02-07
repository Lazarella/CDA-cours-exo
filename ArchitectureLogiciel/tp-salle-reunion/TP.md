###  TP

Développer une application de réservation de salles qui permet aux utilisateurs de réserver des salles pour des réunions.

### Fonctionnalités Clés

1. **Recherche de Salles Disponibles** : Les utilisateurs peuvent rechercher des salles disponibles en spécifiant la date, l'heure, et la capacité requise.
2. **Réservation de Salle** : Permettre aux utilisateurs de réserver une salle en indiquant le créneau horaire, la date.
4. **Administration** : Les administrateurs peuvent ajouter, modifier ou supprimer des salles, ainsi que visualiser toutes les réservations.

## Titre : Recherche et réservation de salles pour des réunions

En tant que utilisateur de l'application de réservation de salles,

Je souhaite pouvoir rechercher des salles disponibles en spécifiant la date, l'heure et la capacité requise,

Afin de trouver et réserver la salle la plus adaptée à mes besoins pour une réunion.

# Critères d'acceptation :

1. L'utilisateur doit pouvoir entrer une date, une plage horaire et un nombre de participants pour sa recherche.
2. L'application doit afficher uniquement les salles disponibles qui correspondent aux critères de recherche.
3. L'utilisateur doit pouvoir sélectionner une salle parmi celles disponibles et procéder à la réservation.

## Titre : Gestion des salles de réunion par les administrateurs

En tant que administrateur de l'application de réservation de salles,

Je souhaite pouvoir ajouter, modifier, ou supprimer des salles dans l'application,

Ainsi que visualiser toutes les réservations effectuées,

Afin de gérer efficacement l'espace de réunion disponible et répondre aux besoins des utilisateurs.

# Critères d'acceptation :

1. L'administrateur doit avoir accès à une interface lui permettant de gérer les informations des salles (ajout, modification, suppression).
2. L'administrateur doit pouvoir consulter une liste de toutes les réservations, avec la possibilité de filtrer par date, salle, ou utilisateur.
3. L'application doit refléter en temps réel les modifications apportées par l'administrateur sur la disponibilité des salles.
4. L'application doit empêcher la suppression de salles qui ont déjà été réservées pour des créneaux futurs, ou proposer une solution alternative pour les réservations affectées.
