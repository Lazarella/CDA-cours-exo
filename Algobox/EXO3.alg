<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER User_Birth_Year"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#First_Name" algoitem="First_Name EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#Last_Name" algoitem="Last_Name EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#Nom_Complet" algoitem="Nom_Complet EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#User_Age" algoitem="User_Age EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#User_Birth_Year" algoitem="User_Birth_Year EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Entrez votre nom : #0" algoitem="AFFICHER &quot;Entrez votre nom : &quot;"/>
        <item code="2#Last_Name#pasliste" algoitem="LIRE Last_Name"/>
        <item code="4#Entrez votre prénom : #0" algoitem="AFFICHER &quot;Entrez votre prénom : &quot;"/>
        <item code="2#First_Name#pasliste" algoitem="LIRE First_Name"/>
        <item code="4#Entrez votre age #0" algoitem="AFFICHER &quot;Entrez votre age &quot;"/>
        <item code="2#User_Age#pasliste" algoitem="LIRE User_Age"/>
        <item code="5#Nom_Complet#First_Name+&quot; &quot;+Last_Name#pasliste" algoitem="Nom_Complet PREND_LA_VALEUR First_Name+&quot; &quot;+Last_Name"/>
        <item code="4#Bonjour #0" algoitem="AFFICHER &quot;Bonjour &quot;"/>
        <item code="3#Nom_Complet#1#pasliste" algoitem="AFFICHER Nom_Complet"/>
        <item code="5#User_Birth_Year#2023-User_Age#pasliste" algoitem="User_Birth_Year PREND_LA_VALEUR 2023-User_Age"/>
        <item code="4#Vous avez #0" algoitem="AFFICHER &quot;Vous avez &quot;"/>
        <item code="3#User_Age#0#pasliste" algoitem="AFFICHER User_Age"/>
        <item code="4# ans.#1" algoitem="AFFICHER &quot; ans.&quot;"/>
        <item code="4#Vous devriez être né.e en #0" algoitem="AFFICHER &quot;Vous devriez être né.e en &quot;"/>
        <item code="3#User_Birth_Year#0#pasliste" algoitem="AFFICHER User_Birth_Year"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
