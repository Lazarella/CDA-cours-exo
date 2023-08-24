<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;€.&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" totalAffichages="1000" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Capital EST_DU_TYPE NOMBRE" code="1#NOMBRE#Capital"/>
        <item algoitem="Taux EST_DU_TYPE NOMBRE" code="1#NOMBRE#Taux"/>
        <item algoitem="NB_Years EST_DU_TYPE NOMBRE" code="1#NOMBRE#NB_Years"/>
        <item algoitem="Estimate EST_DU_TYPE NOMBRE" code="1#NOMBRE#Estimate"/>
        <item algoitem="Gain EST_DU_TYPE NOMBRE" code="1#NOMBRE#Gain"/>
        <item algoitem="Total_Rate EST_DU_TYPE NOMBRE" code="1#NOMBRE#Total_Rate"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Indiquez le montant de votre capital&quot;" code="4#Indiquez le montant de votre capital#0"/>
        <item algoitem="LIRE Capital" code="2#Capital#pasliste"/>
        <item algoitem="AFFICHER &quot;Indiquez le taux proposé&quot;" code="4#Indiquez le taux proposé#0"/>
        <item algoitem="LIRE Taux" code="2#Taux#pasliste"/>
        <item algoitem="AFFICHER &quot;Indiquer le nombre d'années cotisées&quot;" code="4#Indiquer le nombre d'années cotisées#0"/>
        <item algoitem="LIRE NB_Years" code="2#NB_Years#pasliste"/>
        <item algoitem="//Total_Rate PREND_LA_VALEUR" code="19#Total_Rate PREND_LA_VALEUR"/>
        <item algoitem="Estimate PREND_LA_VALEUR Capital*pow((1+(Taux/100)),NB_Years)" code="5#Estimate#Capital*pow((1+(Taux/100)),NB_Years)#pasliste"/>
        <item algoitem="AFFICHER Estimate" code="3#Estimate#0#pasliste"/>
        <item algoitem="AFFICHER &quot; soit un gain de &quot;" code="4# soit un gain de #0"/>
        <item algoitem="Gain PREND_LA_VALEUR Estimate-Capital" code="5#Gain#Estimate-Capital#pasliste"/>
        <item algoitem="AFFICHER Gain" code="3#Gain#0#pasliste"/>
        <item algoitem="AFFICHER &quot;€.&quot;" code="4#€.#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
