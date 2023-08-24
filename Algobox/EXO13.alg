<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER Max_Nb"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurPoint="2" totalBoucles="5000000" totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000" nbDecimales="8" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="User_Nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#User_Nb"/>
        <item algoitem="Max_Nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#Max_Nb"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="POUR i ALLANT_DE 1 A 6" code="12#i#1#6">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER &quot;Entrer un nombre, encore &quot;" code="4#Entrer un nombre, encore #0"/>
            <item algoitem="AFFICHERCALCUL 7-i" code="20#7-i#1"/>
            <item algoitem="SI (i==1) ALORS" code="6#i==1">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="LIRE Max_Nb" code="2#Max_Nb#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="LIRE User_Nb" code="2#User_Nb#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="SI (User_Nb>Max_Nb) ALORS" code="6#User_Nb>Max_Nb">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="Max_Nb PREND_LA_VALEUR User_Nb" code="5#Max_Nb#User_Nb#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Le nombre le plus grand est &quot;" code="4#Le nombre le plus grand est #0"/>
        <item algoitem="AFFICHER Max_Nb" code="3#Max_Nb#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
