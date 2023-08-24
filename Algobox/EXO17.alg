<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SINON" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" arrondiAuto="vrai" epaisseurPoint="2" maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#NB_NOTES" algoitem="NB_NOTES EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#NB_ENTRE" algoitem="NB_ENTRE EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#NOTE_MIN" algoitem="NOTE_MIN EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#NOTE_MAX" algoitem="NOTE_MAX EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#SUM" algoitem="SUM EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#CHOIX_MENU" algoitem="CHOIX_MENU EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="15#NB_ENTRE != -1" algoitem="TANT_QUE (NB_ENTRE != -1) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Veuillez entrer la note n°#0" algoitem="AFFICHER &quot;Veuillez entrer la note n°&quot;"/>
            <item code="20#NB_NOTES + 1#0" algoitem="AFFICHERCALCUL NB_NOTES + 1"/>
            <item code="4# (-1 pour STOP) : #0" algoitem="AFFICHER &quot; (-1 pour STOP) : &quot;"/>
            <item code="2#NB_ENTRE#pasliste" algoitem="LIRE NB_ENTRE"/>
            <item code="6#NB_ENTRE != -1" algoitem="SI (NB_ENTRE != -1) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#NB_NOTES#NB_NOTES + 1#pasliste" algoitem="NB_NOTES PREND_LA_VALEUR NB_NOTES + 1"/>
                <item code="5#SUM#SUM + NB_ENTRE#pasliste" algoitem="SUM PREND_LA_VALEUR SUM + NB_ENTRE"/>
                <item code="6#NB_NOTES == 1" algoitem="SI (NB_NOTES == 1) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="5#NOTE_MAX#NB_ENTRE#pasliste" algoitem="NOTE_MAX PREND_LA_VALEUR NB_ENTRE"/>
                    <item code="5#NOTE_MIN#NB_ENTRE#pasliste" algoitem="NOTE_MIN PREND_LA_VALEUR NB_ENTRE"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#NB_ENTRE > NOTE_MAX" algoitem="SI (NB_ENTRE > NOTE_MAX) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="5#NOTE_MAX#NB_ENTRE#pasliste" algoitem="NOTE_MAX PREND_LA_VALEUR NB_ENTRE"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                        </item>
                        <item code="6#NB_ENTRE &lt; NOTE_MIN" algoitem="SI (NB_ENTRE &lt; NOTE_MIN) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="5#NOTE_MIN#NB_ENTRE#pasliste" algoitem="NOTE_MIN PREND_LA_VALEUR NB_ENTRE"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="6#NB_NOTES > 0" algoitem="SI (NB_NOTES > 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#CHOIX_MENU#-1#pasliste" algoitem="CHOIX_MENU PREND_LA_VALEUR -1"/>
            <item code="15#CHOIX_MENU != 0" algoitem="TANT_QUE (CHOIX_MENU != 0) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="4#\n=== MENU ===#1" algoitem="AFFICHER &quot;\n=== MENU ===&quot;"/>
                <item code="4#1. Afficher la plus petite note#1" algoitem="AFFICHER &quot;1. Afficher la plus petite note&quot;"/>
                <item code="4#2. Afficher la plus grande note#1" algoitem="AFFICHER &quot;2. Afficher la plus grande note&quot;"/>
                <item code="4#3. Afficher la moyenne des notes#1" algoitem="AFFICHER &quot;3. Afficher la moyenne des notes&quot;"/>
                <item code="4#0. Quitter le programme#1" algoitem="AFFICHER &quot;0. Quitter le programme&quot;"/>
                <item code="4#Votre choix : #0" algoitem="AFFICHER &quot;Votre choix : &quot;"/>
                <item code="2#CHOIX_MENU#pasliste" algoitem="LIRE CHOIX_MENU"/>
                <item code="6#CHOIX_MENU == 1" algoitem="SI (CHOIX_MENU == 1) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#La plus petite note est #0" algoitem="AFFICHER &quot;La plus petite note est &quot;"/>
                    <item code="3#NOTE_MIN#1#pasliste" algoitem="AFFICHER NOTE_MIN"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#CHOIX_MENU == 2" algoitem="SI (CHOIX_MENU == 2) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#La plus grande note est #0" algoitem="AFFICHER &quot;La plus grande note est &quot;"/>
                            <item code="3#NOTE_MAX#1#pasliste" algoitem="AFFICHER NOTE_MAX"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#CHOIX_MENU == 3" algoitem="SI (CHOIX_MENU == 3) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="4#La moyenne des notes est de #0" algoitem="AFFICHER &quot;La moyenne des notes est de &quot;"/>
                                    <item code="20#SUM / NB_NOTES#1" algoitem="AFFICHERCALCUL SUM / NB_NOTES"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#Il n'y a aucune note dans le programme...#1" algoitem="AFFICHER &quot;Il n'y a aucune note dans le programme...&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
