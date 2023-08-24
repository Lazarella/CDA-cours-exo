<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHERCALCUL NbA + 2015" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurPoint="2" epaisseurLigne="2" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#NbA" algoitem="NbA EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="15#96809 * pow(1 + 0.0089, NbA) &lt; 120000" algoitem="TANT_QUE (96809 * pow(1 + 0.0089, NbA) &lt; 120000) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#NbA#NbA + 1#pasliste" algoitem="NbA PREND_LA_VALEUR NbA + 1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Au bout de #0" algoitem="AFFICHER &quot;Au bout de &quot;"/>
        <item code="3#NbA#0#pasliste" algoitem="AFFICHER NbA"/>
        <item code="4# ans à partir de 2015, Tourcoing aura dépassé les 120000 habitants. Nous serons en #0" algoitem="AFFICHER &quot; ans à partir de 2015, Tourcoing aura dépassé les 120000 habitants. Nous serons en &quot;"/>
        <item code="20#NbA + 2015#0" algoitem="AFFICHERCALCUL NbA + 2015"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
