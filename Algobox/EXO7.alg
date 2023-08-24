<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" nbDecimales="8" epaisseurLigne="2" maxBoucle="500000" totalBoucles="5000000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#Age" algoitem="Age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#***** Bienvenue chez les juniors *****#1" algoitem="AFFICHER &quot;***** Bienvenue chez les juniors *****&quot;"/>
        <item code="4#Quel est l'âge de l'enfant? #0" algoitem="AFFICHER &quot;Quel est l'âge de l'enfant? &quot;"/>
        <item code="2#Age#pasliste" algoitem="LIRE Age"/>
        <item code="6#Age&lt;3" algoitem="SI (Age&lt;3) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#L'enfant n'a pas l'âge requis ＞﹏＜#0" algoitem="AFFICHER &quot;L'enfant n'a pas l'âge requis ＞﹏＜&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#Age>2 &amp;&amp; Age&lt;7" algoitem="SI (Age>2 &amp;&amp; Age&lt;7) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Bienvenue dans la catégorie Baby!#0" algoitem="AFFICHER &quot;Bienvenue dans la catégorie Baby!&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#Age>6 &amp;&amp; Age&lt;9" algoitem="SI (Age>6 &amp;&amp; Age&lt;9) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#Bienvenue dans la catégorie Poussin!#0" algoitem="AFFICHER &quot;Bienvenue dans la catégorie Poussin!&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#Age>8 &amp;&amp; Age&lt;11" algoitem="SI (Age>8 &amp;&amp; Age&lt;11) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="4#Bienvenue dans la catégorie Pupille!#0" algoitem="AFFICHER &quot;Bienvenue dans la catégorie Pupille!&quot;"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="6#Age>10 &amp;&amp; Age&lt;13" algoitem="SI (Age>10 &amp;&amp; Age&lt;13) ALORS">
                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                            <item code="4#Bienvenue dans la catégorie Minime!#0" algoitem="AFFICHER &quot;Bienvenue dans la catégorie Minime!&quot;"/>
                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                            <item code="9#sinon" algoitem="SINON">
                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                <item code="6#Age>12 &amp;&amp; Age&lt;16" algoitem="SI (Age>12 &amp;&amp; Age&lt;16) ALORS">
                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                    <item code="4#Bienvenue dans la catégorie Cadet!#0" algoitem="AFFICHER &quot;Bienvenue dans la catégorie Cadet!&quot;"/>
                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                    <item code="9#sinon" algoitem="SINON">
                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON">
                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                            <item code="6#Age>15" algoitem="SI (Age>15) ALORS"/>
                                                            <item code="4#Vous jouez dans la cours des grands maintenant!#0" algoitem="AFFICHER &quot;Vous jouez dans la cours des grands maintenant!&quot;"/>
                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                        </item>
                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                    </item>
                                                </item>
                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                            </item>
                                        </item>
                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                    </item>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
