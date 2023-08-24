<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER Display"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" totalAffichages="1000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalBoucles="5000000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#User_Nb" algoitem="User_Nb EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#Display" algoitem="Display EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#I" algoitem="I EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez entrez un nombre entier#0" algoitem="AFFICHER &quot;Veuillez entrez un nombre entier&quot;"/>
        <item code="2#User_Nb#pasliste" algoitem="LIRE User_Nb"/>
        <item code="12#I#1#User_Nb -1" algoitem="POUR I ALLANT_DE 1 A User_Nb -1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#Display#Display+ I + &quot; &quot;#pasliste" algoitem="Display PREND_LA_VALEUR Display+ I + &quot; &quot;"/>
            <item code="3#Display#1#pasliste" algoitem="AFFICHER Display"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="5#Display#Display+I#pasliste" algoitem="Display PREND_LA_VALEUR Display+I"/>
        <item code="3#Display#1#pasliste" algoitem="AFFICHER Display"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
