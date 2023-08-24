<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#Grade" algoitem="Grade EST_DU_TYPE NOMBRE"/>
        <item code="1#LISTE#Table" algoitem="Table EST_DU_TYPE LISTE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="12#i#0#14" algoitem="POUR i ALLANT_DE 0 A 14">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#Entrer les notes : #1" algoitem="AFFICHER &quot;Entrer les notes : &quot;"/>
            <item code="2#Grade#pasliste" algoitem="LIRE Grade"/>
            <item code="4#/20\n#1" algoitem="AFFICHER &quot;/20\n&quot;"/>
            <item code="4#Encore #0" algoitem="AFFICHER &quot;Encore &quot;"/>
            <item code="20#14-i#0" algoitem="AFFICHERCALCUL 14-i"/>
            <item code="4# à entrer\n#0" algoitem="AFFICHER &quot; à entrer\n&quot;"/>
            <item code="5#Table#Grade#i" algoitem="Table[i] PREND_LA_VALEUR Grade"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="4# Esemble des notes : \n#0" algoitem="AFFICHER &quot; Esemble des notes : \n&quot;"/>
        <item code="12#i#0#14" algoitem="POUR i ALLANT_DE 0 A 14">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="3#Table#0#i" algoitem="AFFICHER Table[i]"/>
            <item code="4# ＜（＾－＾）＞ #0" algoitem="AFFICHER &quot; ＜（＾－＾）＞ &quot;"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
