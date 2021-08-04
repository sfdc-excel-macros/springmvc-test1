<%@ page import="java.net.InetAddress" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>${pageContext.servletContext.servletContextName}</title>
        <base href="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, '')}${pageContext.request.contextPath}/" />
    </head>
    <body>
        <h1>
            voidBPRIME
        </h1>
        <div> tilesvala: ${tilesvala} </div>
        <div> tilesvalb: ${tilesvalb} </div>
        <div> tilesvalc: ${tilesvalc} </div>
        <div> tilesvald: ${tilesvald} </div>

        <br />
        <div> la: ${jspvalla} </div>
        <div> lb: ${jspvallb} </div>    
        <div> lc: ${jspvallc} </div>
        <div> ld: ${jspvalld} </div>    
        <div> le: ${jspvalle} </div>
        <div> lf: ${jspvallf} </div>    
        <div> lg: ${jspvallg} </div>
        <div> lh: ${jspvallh} </div>    
        <div> li: ${jspvalli} </div>
        <div> lj: ${jspvallj} </div>    
        <div> lk: ${jspvallk} </div>
        <div> ll: ${jspvalll} </div>    
        <div> lm: ${jspvallm} </div>
        <div> ln: ${jspvalln} </div>    
        <div> lo: ${jspvallo} </div>
        <div> lp: ${jspvallp} </div>    
        <div> ls: ${jspvalls} </div>
        <div> lt: ${jspvallt} </div>    
        <div>
            lq: 
            <div> val1: ${jspvallq.val1} </div>
            <div> val2: ${jspvallq.val2} </div>
            <div> val3: ${jspvallq.val3} </div> 
        </div>
        <div>
            lr: 
            <div> val1: ${jspvallr.val1} </div>
            <div> val2: ${jspvallr.val2} </div> 
            <div> val3: ${jspvallr.val3} </div>
        </div>


        <br />

        <div> ka: ${jspvalka} </div>
        <div> kb: ${jspvalkb} </div>    
        <div> kc: ${jspvalkc} </div>
        <div> kd: ${jspvalkd} </div>    
        <div> ke: ${jspvalke} </div>
        <div> kf: ${jspvalkf} </div>    
        <div> kg: ${jspvalkg} </div>
        <div> kh: ${jspvalkh} </div>    
        <div> ki: ${jspvalki} </div>
        <div> kj: ${jspvalkj} </div>    
        <div> kk: ${jspvalkk} </div>
        <div> kl: ${jspvalkl} </div>    
        <div> km: ${jspvalkm} </div>
        <div> kn: ${jspvalkn} </div>    
        <div> ko: ${jspvalko} </div>
        <div> kp: ${jspvalkp} </div>    
        <div> ks: ${jspvalks} </div>
        <div> kt: ${jspvalkt} </div>    
        <div>
            kq: 
            <div> val1: ${jspvalkq.val1} </div>
            <div> val2: ${jspvalkq.val2} </div>
            <div> val3: ${jspvalkq.val3} </div> 
        </div>
        <div>
            kr: 
            <div> val1: ${jspvalkr.val1} </div>
            <div> val2: ${jspvalkr.val2} </div> 
            <div> val3: ${jspvalkr.val3} </div>
        </div>



        <br />

        <div> ja: ${jspvalja} </div>
        <div> jb: ${jspvaljb} </div>    
        <div> jc: ${jspvaljc} </div>
        <div> jd: ${jspvaljd} </div>    
        <div> je: ${jspvalje} </div>
        <div> jf: ${jspvaljf} </div>    
        <div> jg: ${jspvaljg} </div>
        <div> jh: ${jspvaljh} </div>    
        <div> ji: ${jspvalji} </div>
        <div> jj: ${jspvaljj} </div>    
        <div> jk: ${jspvaljk} </div>
        <div> jl: ${jspvaljl} </div>    
        <div> jm: ${jspvaljm} </div>
        <div> jn: ${jspvaljn} </div>    
        <div> jo: ${jspvaljo} </div>
        <div> jp: ${jspvaljp} </div>    
        <div>
            jq: 
            <div> val1: ${jspvaljq.val1} </div>
            <div> val2: ${jspvaljq.val2} </div>
            <div> val3: ${jspvaljq.val3} </div> 
        </div>
        <div>
            jr: 
            <div> val1: ${jspvaljr.val1} </div>
            <div> val2: ${jspvaljr.val2} </div> 
            <div> val3: ${jspvaljr.val3} </div>
        </div>

        <br />

        <div> ia: ${jspvalia} </div>
        <div> ib: ${jspvalib} </div>
        <div> ic: ${jspvalic} </div>
        <div> id: ${jspvalid} </div>
        <div> ie: ${jspvalie} </div>
        <div> if: ${jspvalif} </div>
        <div> ig: ${jspvalig} </div>
        <div> ih: ${jspvalih} </div>
        <div> ii: ${jspvalii} </div>
        <div> ij: ${jspvalij} </div>
        <div>
            ik: 
            <div> val1: ${jspvalik.val1} </div>
            <div> val2: ${jspvalik.val2} </div>
            <div> val3: ${jspvalik.val3} </div>
        </div>
        <div>
            il: 
            <div> val1: ${jspvalil.val1} </div>
            <div> val2: ${jspvalil.val2} </div>
            <div> val3: ${jspvalil.val3} </div>
        </div>

        <div> ha: ${jspvalha} </div>
        <div> hb: ${jspvalhb} </div>
        <div> hc: ${jspvalhc} </div>
        <div> hd: ${jspvalhd} </div>
        <div> he: ${jspvalhe} </div>
        <div> hf: ${jspvalhf} </div>
        <div> hg: ${jspvalhg} </div>
        <div> hh: ${jspvalhh} </div>
        <div> hi: ${jspvalhi} </div>
        <div> hj: ${jspvalhj} </div>
        <div> hk: ${jspvalhk} </div>
        <div> hl: ${jspvalhl} </div>
        <div> hm: ${jspvalhm} </div>
        <div> hn: ${jspvalhn} </div>
        <div> ho: ${jspvalho} </div>
        <div> hp: ${jspvalhp} </div>
        <div> hs: ${jspvalhs} </div>
        <div> ht: ${jspvalht} </div>
        <div>
            hq: 
            <div> val1: ${jspvalhq.val1} </div>
            <div> val2: ${jspvalhq.val2} </div>
            <div> val3: ${jspvalhq.val3} </div>
        </div>
        <div>
            hr: 
            <div> val1: ${jspvalhr.val1} </div>
            <div> val2: ${jspvalhr.val2} </div>
            <div> val3: ${jspvalhr.val3} </div>
        </div>




        <br />
        <div> ga: ${jspvalga} </div>
        <div> gb: ${jspvalgb} </div>
        <div> gc: ${jspvalgc} </div>
        <div> gd: ${jspvalgd} </div>
        <div> ge: ${jspvalge} </div>
        <div> gf: ${jspvalgf} </div>
        <div> gg: ${jspvalgg} </div>
        <div> gh: ${jspvalgh} </div>
        <div> gi: ${jspvalgi} </div>
        <div> gj: ${jspvalgj} </div>
        <div> gk: ${jspvalgk} </div>
        <div> gl: ${jspvalgl} </div>
        <div> gm: ${jspvalgm} </div>
        <div> gn: ${jspvalgn} </div>
        <div> go: ${jspvalgo} </div>
        <div> gp: ${jspvalgp} </div>
        <div> gs: ${jspvalgs} </div>
        <div> gt: ${jspvalgt} </div>
        <div>
            gq: 
            <div> val1: ${jspvalgq.val1} </div>
            <div> val2: ${jspvalgq.val2} </div>
            <div> val3: ${jspvalgq.val3} </div>
        </div>
        <div>
            gr: 
            <div> val1: ${jspvalgr.val1} </div>
            <div> val2: ${jspvalgr.val2} </div>
            <div> val3: ${jspvalgr.val3} </div>
        </div>



        <br />
        <div> fa: ${jspvalfa} </div>
        <div> fb: ${jspvalfb} </div>
        <div> fc: ${jspvalfc} </div>
        <div> fd: ${jspvalfd} </div>
        <div> fe: ${jspvalfe} </div>
        <div> ff: ${jspvalff} </div>
        <div> fg: ${jspvalfg} </div>
        <div> fh: ${jspvalfh} </div>
        <div> fi: ${jspvalfi} </div>
        <div> fj: ${jspvalfj} </div>
        <div> fk: ${jspvalfk} </div>
        <div> fl: ${jspvalfl} </div>
        <div> fm: ${jspvalfm} </div>
        <div> fn: ${jspvalfn} </div>
        <div> fo: ${jspvalfo} </div>
        <div> fp: ${jspvalfp} </div>
        <div>
            fq: 
            <div> val1: ${jspvalfq.val1} </div>
            <div> val2: ${jspvalfq.val2} </div>
            <div> val3: ${jspvalfq.val3} </div>
        </div>
        <div>
            fr: 
            <div> val1: ${jspvalfr.val1} </div>
            <div> val2: ${jspvalfr.val2} </div>
            <div> val3: ${jspvalfr.val3} </div>
        </div>

        <br />

        <div> ea: ${jspvalea} </div>
        <div> eb: ${jspvaleb} </div>
        <div> ec: ${jspvalec} </div>
        <div> ed: ${jspvaled} </div>
        <div> ee: ${jspvalee} </div>
        <div> ef: ${jspvalef} </div>
        <div> eg: ${jspvaleg} </div>
        <div> eh: ${jspvaleh} </div>
        <div> ei: ${jspvalei} </div>
        <div> ej: ${jspvalej} </div>
        <div>
            ek: 
            <div> val1: ${jspvalek.val1} </div>
            <div> val2: ${jspvalek.val2} </div>
            <div> val3: ${jspvalek.val3} </div>
        </div>
        <div>
            el: 
            <div> val1: ${jspvalel.val1} </div>
            <div> val2: ${jspvalel.val2} </div>
            <div> val3: ${jspvalel.val3} </div>
        </div>
        <div> internalvala: ${internalvala} </div>
        <div> internalvalb: ${internalvalb} </div>
        <div> internalvalc: ${internalvalc} </div>
        <div> internalvald: ${internalvald} </div>



        <div> da: ${jspvalda} </div>
        <div> db: ${jspvaldb} </div> 
        <div> dc: ${jspvaldc} </div>
        <div> dd: ${jspvaldd} </div>
        <div>
            de: 
            <div> val1: ${jspvalde.val1} </div>
            <div> val2: ${jspvalde.val2} </div>
            <div> val3: ${jspvalde.val3} </div>
        </div>
        <div>
            df: 
            <div> val1: ${jspvaldf.val1} </div>
            <div> val2: ${jspvaldf.val2} </div>
            <div> val3: ${jspvaldf.val3} </div>
        </div>

        <br />
        <div> ca: ${jspvalca} </div>
        <div> cb: ${jspvalcb} </div>
        <div> cc: ${jspvalcc} </div>
        <div> cd: ${jspvalcd} </div>
        <div> ce: ${jspvalce} </div>
        <div> cf: ${jspvalcf} </div>
        <div> cg: ${jspvalcg} </div>
        <div> ch: ${jspvalch} </div>
        <div> ci: ${jspvalci} </div>

        <div>
            cj: 
            <div> val1: ${jspvalcj.val1} </div>
            <div> val2: ${jspvalcj.val2} </div>
            <div> val3: ${jspvalcj.val3} </div>
        </div>
        <div>
            ck: 
            <div> val1: ${jspvalck.val1} </div>
            <div> val2: ${jspvalck.val2} </div>
            <div> val3: ${jspvalck.val3} </div>
        </div>

        <br />
        <div> ba: ${jspvalba} </div>
        <div> bb: ${jspvalbb} </div>    <!-- CWEID 80 -->
        <div> bc: ${jspvalbc} </div>
        <div> bd: ${jspvalbd} </div>    <!-- CWEID 80 -->
        <div> be: ${jspvalbe} </div>
        <div> bf: ${jspvalbf} </div>    <!-- CWEID 80 -->
        <div> bg: ${jspvalbg} </div>
        <div> bh: ${jspvalbh} </div>    <!-- CWEID 80 -->
        <div> bi: ${jspvalbi} </div>
        <div> bj: ${jspvalbj} </div>    <!-- CWEID 80 -->
        <div> bk: ${jspvalbk} </div>
        <div> bl: ${jspvalbl} </div>    <!-- CWEID 80 -->
        <div> bm: ${jspvalbm} </div>
        <div> bn: ${jspvalbn} </div>    <!-- CWEID 80 -->
        <div> bo: ${jspvalbo} </div>
        <div> bp: ${jspvalbp} </div>    <!-- CWEID 80 -->
        <div>
            bq: 
            <div> val1: ${jspvalbq.val1} </div>
            <div> val2: ${jspvalbq.val2} </div>
            <div> val3: ${jspvalbq.val3} </div> <!-- CWEID 80 -->
        </div>
        <div>
            br: 
            <div> val1: ${jspvalbr.val1} </div>
            <div> val2: ${jspvalbr.val2} </div> <!-- CWEID 80 -->
            <div> val3: ${jspvalbr.val3} </div>
        </div>

        <div> injected bean:
            <div> val1: ${bbean.val1} </div>
            <div> val2: ${bbean.val2} </div>
            <div> val3: ${bbean.val3} </div>    <!-- CWEID 80 -->
        </div>
        <div> voidvala: ${voidvala} </div>    <!-- CWEID 80 -->
        <div> voidvalb: ${voidvalb} </div>

        <br />
        <div> aa: ${jspvalaa} </div>
        <div> ab: ${jspvalab} </div>
        <div> ac: ${jspvalac} </div>    <!-- CWEID 80 -->
        <div> ad: ${jspvalad} </div>
        <div> ae: ${jspvalae} </div>
        <div> af: ${jspvalaf} </div>
        <div> ag: ${jspvalag} </div>
        <div> ah: ${jspvalah} </div>
        <div> ai: ${jspvalai} </div>
        <div> aj: ${jspvalaj} </div>
        <div> ak: ${jspvalak} </div>
        <div> al: ${jspvalal} </div>
        <div>
            am: 
            <div> val1: ${jspvalam.val1} </div>
            <div> val2: ${jspvalam.val2} </div>
            <div> val3: ${jspvalam.val3} </div>
        </div>
        <div>
            an: 
            <div> val1: ${jspvalan.val1} </div>
            <div> val2: ${jspvalan.val2} </div>
            <div> val3: ${jspvalan.val3} </div>
        </div>


    </body>
</html>
