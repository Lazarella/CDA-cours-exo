<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" totalAffichages="1000" epaisseurPoint="2" nbDecimales="8" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION Factorielle(Nb)" code="201#Factorielle#Nb">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction">
                <item algoitem="Nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#Nb"/>
                <item algoitem="B EST_DU_TYPE NOMBRE" code="1#NOMBRE#B"/>
                <item algoitem="iFunc EST_DU_TYPE NOMBRE" code="1#NOMBRE#iFunc"/>
            </item>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="B PREND_LA_VALEUR 1" code="5#B#1#pasliste"/>
            <item algoitem="POUR iFunc ALLANT_DE 1 A Nb" code="12#iFunc#1#Nb">
                <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                <item algoitem="B PREND_LA_VALEUR B*iFunc" code="5#B#B*iFunc#pasliste"/>
                <item algoitem="FIN_POUR" code="14#finpour"/>
            </item>
            <item algoitem="RENVOYER B" code="205#B"/>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="User_Nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#User_Nb"/>
        <item algoitem="Table EST_DU_TYPE LISTE" code="1#LISTE#Table"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez entrer un nombre entier supérieur à 0&quot;" code="4#Veuillez entrer un nombre entier supérieur à 0#1"/>
        <item algoitem="LIRE User_Nb" code="2#User_Nb#pasliste"/>
        <item algoitem="AFFICHERCALCUL Factorielle(User_Nb)" code="20#Factorielle(User_Nb)#1"/>
        <item algoitem="POUR i ALLANT_DE 0 A User_Nb" code="12#i#0#User_Nb">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="Table[i] PREND_LA_VALEUR Factorielle(i)" code="5#Table#Factorielle(i)#i"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="POUR i ALLANT_DE 0 A User_Nb" code="12#i#0#User_Nb">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER Table[i]" code="3#Table#0#i"/>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
