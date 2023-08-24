<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_TANT_QUE"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" epaisseurPoint="2" epaisseurLigne="2" maxBoucle="500000" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="User_Nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#User_Nb"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Entrez 1, 2 ou 3&quot;" code="4#Entrez 1, 2 ou 3#0"/>
        <item algoitem="LIRE User_Nb" code="2#User_Nb#pasliste"/>
        <item algoitem="TANT_QUE (User_Nb&lt;1 &amp;&amp; User_Nb>3) FAIRE" code="15#User_Nb&lt;1 &amp;&amp; User_Nb>3">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Entrez 1, 2 ou 3 pliiiz&quot;" code="4#Entrez 1, 2 ou 3 pliiiz#0"/>
            <item algoitem="LIRE User_Nb" code="2#User_Nb#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
