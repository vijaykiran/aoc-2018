(ns aoc-2018.two
  (:require [clojure.string :as str]))

(def input "uqcipadzntnheslgvjjozmkfyr
uqcipadzwtnhexlzvxjobmkfkr
cqcipadpwtnheslgyxjobmkfyr
ubnipadzwtnheslgvxjobmkfyw
uqcisadzwtnheslgvxjfbmkfor
uqcisaezwtnheslgvxkobmkfyr
uqcguadzwtnheslgvxjobmkfir
uqcipadzmtnhesldvxdobmkfyr
uqcipadzwtzheslgdxjtbmkfyr
uquipadzwtcheslgvxjobmkfbr
uqctpadzwtnhesjbvxjobmkfyr
ueciparzwtnheslgvxjobmkfyx
uqcipadzwtnhessgvxjkbmkfkr
uqcipamzwtnheslgvxioamkfyr
uciizadzwtnheslgvxjobmkfyr
uqcieadzwtnhesfgvxeobmkfyr
fqcipadzwtnreslgvkjobmkfyr
uqcipadzrtnherlgvxjobmklyr
uqcypadzwtnheslgvxjobmkxfr
uqcipadzwtnhemlgvxjobmvfur
uwciuadzwwnheslgvxjobmkfyr
uqcipadzwtnhcscgvxjobmkuyr
upripadzwtnheslovxjobmkfyr
uqcipadzltnheslgvxjobmkftc
uqcipadzwtnheslgvgjobmifsr
uqoipadzwtnheslgvxjosmkfkr
uqcipadzwtbhesrqvxjobmkfyr
uqcipadzwtnheslpvxjobmhfyx
uhcinadzwtnheslgvxjybmkfyr
uqcipadzwtnhhslgvxjabmkbyr
uecipadzwtnheslgvxjobqyfyr
uqcipadfwtnheslwvxjobgkfyr
uqcipadzvtnheshgvxzobmkfyr
fqcipadzwtcheslgvxjobmkfyt
uecipadzwtnheslgpxjbbmkfyr
uqclpadzwtnheslgvnjobukfyr
qqciprdzetnheslgvxjobmkfyr
uqcipahpwtnheslgvxjtbmkfyr
uqcidadzwtnhesljvxyobmkfyr
uqciradswtnqeslgvxjobmkfyr
uqcipadzwtrhmslgvxjobmkfyf
urcipadzjtnheslgvxfobmkfyr
uqcipadzwznheslgvxjobmkfcv
uqcipadowtnheslgyxjobmkfym
uqcigadzwtnheslgvxjoomkmyr
uqjipafzwtnheslgvejobmkfyr
uqcioadzwtnhhslgvxzobmkfyr
uqcgpadkwtnheslgvxjobhkfyr
ufciiadewtnheslgvxjobmkfyr
uqoipadzwtnheslgvxjllmkfyr
uqcipadzutnheslgwxxobmkfyr
uqcipadzwtlheslgaxjobmkfwr
uqcbpadzutnheslgvxjbbmkfyr
uucipadzwvnhesngvxjobmkfyr
uqcifadzwtnceslgvxjoumkfyr
ujcipadzwteheslgvxjobmkfyj
uqcipadzwtnheslqvxjobmkuyp
uqcipadzwtnheslgvxjoxmkxyw
uqcipaduwtnheslgvujmbmkfyr
uicipadnwtnheslgvxjobmbfyr
uqcipadzwteheslgvxjobbmfyr
uqcipadzwgnneslgvxjobmklyr
uqcipadzxtnhwslgvbjobmkfyr
uqcipaxwwtnheslxvxjobmkfyr
uocipadzwtnheslgvxjobqdfyr
uqciaauzwtnheslgtxjobmkfyr
uncipagzwtnkeslgvxjobmkfyr
uqcipadzwtnhehlgvxjohdkfyr
uqcipadzwtnheslgvxjobmspyz
uccipadzwtnhvsltvxjobmkfyr
  uacipagzwtnheslgvxjoqmkfyr
tqcipaduwtnheslgvxjobmmfyr
uqcipadzwtnheslgvxqebmifyr
uecipadthtnheslgvxjobmkfyr
uocipadzwtnhdslgvkjobmkfyr
uqcipadtwtnheslgvxhobmufyr
uqkipadzwtnleslgtxjobmkfyr
uqcipadzjunheslgvxjobmnfyr
ubcipadzwtvheslgvxjobmkfyf
uqcipadzwpfheslgvxjsbmkfyr
uocipadzwtndeslgvxjobmmfyr
uqcipadzwtnheslgtxjobhkfyq
uqcipadzwtrheslgvxjobmyfya
uqcipadzwtvheslgvxjolgkfyr
uqcipidzwtaheslgvxjobmkfxr
uyzixadzwtnheslgvxjobmkfyr
uqyihadzwtnhedlgvxjobmkfyr
uqcipadzwtnhesltvejobqkfyr
uqciptdzwtnheslgyxlobmkfyr
uqcipzdzwtnhzslgvxjosmkfyr
uqcipadzwtnbeslgexjobmkfvr
uqcipadzwtnheslcwxjobmkkyr
uqcapadzwcnheslgvxjolmkfyr
uqcjpadzwtnhejlgvxjxbmkfyr
uqcipadwwtxweslgvxjobmkfyr
uqmipadzwtnhezlgvxjobmkyyr
uqcipubzwtnpeslgvxjobmkfyr
uecvpadzwtnheslgvxjocmkfyr
uqcipadzwfnheslgvxjibmkdyr
uqcipadzwtnheslgvxvfbykfyr
uqcipadzwtnheslgvgjoimkfyt
dqcqpaqzwtnheslgvxjobmkfyr
uqcipbdzwtnheslgvxjobmkghr
jqcipadzwtnheslgvxjgbmkzyr
uqcipadzwtnheslgvxqkqmkfyr
uqcipadzptnheslgvxjxbokfyr
uucijadzwtwheslgvxjobmkfyr
uccfpadzwtnheslgvxjobpkfyr
uqcipadzwtnheslgvxjobakeyq
uqcipadzwtnheolgvxqobjkfyr
imiipadzwtnheslgvxjobmkfyr
uqcehadzwtnheslgvxjobmkuyr
uqcipadzztnheslgvxjorokfyr
rqcixadzwtnheelgvxjobmkfyr
uqcipadzwtzheslgvxjodmkfyi
uqcipaezwtnwuslgvxjobmkfyr
uqcipadzwtnheslggxjobjkfyq
uqcipadzwkghesagvxjobmkfyr
uqcypqdzwtnheslgvxjobakfyr
iqcipadzwtnhezltvxjobmkfyr
uxcimadzwtnheslgvxjobmxfyr
uqcipaizwtvhwslgvxjobmkfyr
uqcipafzwtnheslgvxjpbmkfym
uqcipadzwinheslgvxlobmpfyr
uqcupadzwtnheslkvxmobmkfyr
uqcapadzwtnhesrgvxjobmkfsr
urcipafzwtnheslgvxjobmkfur
uqcipaczwtnheslgvbjobmknyr
uqcizadzztgheslgvxjobmkfyr
uqcipfdzwtnhesxgvxjobmkfyw
uqcipbdzwtnhyslgvxjobmcfyr
uqcipadzwanhezlgvxjobmkfwr
uvcipadzwtnheslgvxjbkmkfyr
uqcipajzwtnseslgvxjobmkfyq
uqcipvdzwtnheslgvmlobmkfyr
uqcipadzdgnheslgmxjobmkfyr
uqcipddzwtnhestgvpjobmkfyr
umcipadzwtdheslgvxjzbmkfyr
uqciuwdzwtnheslgvxjobmkflr
uqcipadzwtnheslgsxabbmkfyr
uceipadzwtnheslgvxjobgkfyr
mqcipadzwtnhesrgvxjobmjfyr
aqcipadvwtnheslgvxjobmkryr
uqsipadzwtnofslgvxjobmkfyr
uqcixadzwtfheslgvxjzbmkfyr
uqcipadnwfnheslgvxjohmkfyr
uqcivadzwtnheslfvxjobmkfyz
uqciprdzwtnheslgvxjobmkjir
uqcipadhbtnheslgvxjoxmkfyr
fqcipadzwtnhesfgvxjobmkfye
uqoipqdzwtnheqlgvxjobmkfyr
uqcipadzwtnhesltvxmobmkzyr
uqcipadzwtnhebqgvsjobmkfyr
uqcipadzwtnheslglxjobmfbyr
gqcipadzwtgheslgvxjobwkfyr
uqcipadzwtnheslgfxjzbmlfyr
ujcnpadzwtnheslrvxjobmkfyr
ujcivadzwtnheglgvxjobmkfyr
uqcitadzwgnheslgvxjofmkfyr
uqcipahzatnhmslgvxjobmkfyr
uqzipaizwtnheslgvujobmkfyr
uqcipadzltnheylgvnjobmkfyr
uqcidadzwtnhwsljvxyobmkfyr
uqcipadzwtihetlgvxjobhkfyr
oqcipabzwtnheslgvfjobmkfyr
uqcipadzwtnveslgvxjobzkfzr
uqcipadzwtjheslgqxjobmlfyr
uqcnpadzztnheslgvxjobmkoyr
uqciuadzwonheslgvxjobmkfyz
tqcipadzwtnheslgvxaobmqfyr
uqcipadtwtnhqslgvxjobmkeyr
uqcipadzwbnheslgvajobmsfyr
ubcopadzwtnhgslgvxjobmkfyr
uqcipydzwtwheslgvxjobakfyr
cqbijadzwtnheslgvxjobmkfyr
uscipadowtnheslgvxjobmkfcr
uqcipadzwtgheslnvxjobskfyr
uqcipzdzwtnzeslgkxjobmkfyr
uqcipawzwtnhrslgbxjobmkfyr
uqcipadzatchyslgvxjobmkfyr
uqcipadzotnpeslgvxjobmjfyr
uqcipagzwtnheslgvxjobmvfyt
uqcipadzwhnheslgvxyobmkfyo
uqcipadzwtnheslgmqjobmkfyc
uqcupadzwgnheslgvcjobmkfyr
uqcipabzwbnheslgvxjobmkwyr
uqciiadzwtnheslgvxjobmkfmz
uqkipauzwtnheslgvxjjbmkfyr
uqcipidzetnheslgvxjobmkfyi
uqcipadzwtnheslgqxjokmkfmr
uqcipadzqtnhesllvxjobmkfyk
uqccpadzwtnheslgmxsobmkfyr
uqcipadzwteheslgvljfbmkfyr
uqcipadxwinheslgaxjobmkfyr
uqcipadzwtnheslhvxyobmkfjr
aqcipadzwnnheslgvxjqbmkfyr
uvcipadzwtnheszgvxjobmkfyg
uqcipahzmtnheslgvxjobmkfir
ukcipadzbtnheslgvxjobmkfyb
uqcipadzwtnhemlgvqjobmkfpr
uqcipadzwtnheslgvmeobmkfpr
uqciphdrwtnheslgvxjobmkfyw
uqcipadzwtnheslevxqobzkfyr
uqcipadzwknzeslgvxnobmkfyr
wqcipadzwjnheslgvxjobbkfyr
uqcipadzwtdheslgvmjobmkjyr
uqvipadzwtnhextgvxjobmkfyr
uqhipadzwtnheslwvxjzbmkfyr
uqcipadzwtnherlgsxjobmksyr
uqcipadzwtnhesqgvxjotmvfyr
udcipadzwtnhekwgvxjobmkfyr
uqcjprdzwtnheslgvxjobmkfpr
uqcipadzatnheclgvqjobmkfyr
uqcbpadzctnheslqvxjobmkfyr
uqcipadzqtnhesluvxjobrkfyr
uqcipadzwtnhcslgvxjoomwfyr
uqcppadzwxnheslgwxjobmkfyr
uqcipadcwtnheslrvxjdbmkfyr
ukcipadzwtnhhslgvxjobmkgyr
uqckpadzwtnheslgvxjokmkiyr
uqcspadzwtjheslgvxjobmkfjr
uqcipadpwtnhsslgvxjobmkfyu
uqcepadzwtnheilgvbjobmkfyr
jqcipadiwtnheslgvxjobmkjyr
uqcipadzrtnseslgqxjobmkfyr
sqmipadzwtnhewlgvxjobmkfyr
uqcieadzhtnheslgvgjobmkfyr
uqcipadzwkwhewlgvxjobmkfyr
uqcipadzwtzheslgvxjpbqkfyr
uzcipadzjtnheslgvxjobmlfyr
uqcipadzwtnheslnvxjobmkfee
uqciyanzwtnheslgvxjoimkfyr
uqcipadqwtnheswghxjobmkfyr
uycipadzwtnheslovxjobmofyr
uqcipadzwtnheslgvxcozmxfyr
uqmipadzwtnxezlgvxjobmkfyr
uqcipadzftnheslgvxjotmkffr
aqcipaizwtnhesagvxjobmkfyr
uqcipcdzwtnheslgoajobmkfyr
uqcypadgwtnhesbgvxjobmkfyr
uqcipcdzwtnheslgvxjebmkfyb
uhcvpadzwtnheslgvxjobzkfyr
uqcipadzwtnpesagvxmobmkfyr
uqcipadzwtnidslgvxjobmkfor
uqcipadkwtnhesigvxjzbmkfyr
uqcypadlwtnheslsvxjobmkfyr
qqcipadzwtnheswgvxjobmkoyr
uqcipadzwtnheslgvxjhbmmcyr
uqcipadzwtnhesogvxjormkfmr
uqcipadzwtnhetcgvxgobmkfyr")

(defn two? [x]
  (if (> x 1) 1 x))

(defn one []
  (let [as (map
            #(-> %
                 str/trim
                 frequencies
                 vals
                 frequencies
                 (select-keys [2 3])
                 (update 2 (fnil two? 0))
                 (update 3 (fnil two? 0)))
            (str/split input #"\n"))
        bs (reduce
            #(assoc %1
                    2 (+ (get %1 2) (get %2 2))
                    3 (+ (get %1 3) (get %2 3)))
            {2 0, 3 0}
            as)]
    (* (get bs 2) (get bs 3))))

;;; Two

(defn two []
  (let [ss (sort
            (mapv str/trim (str/split input #"\n")))
        ts (reduce (fn [v1 v2]
                     (let [dfs (map #(- (int %1) (int %2)) v1 v2)]
                       (if (= (count (filter #(not (= 0 %)) dfs)) 1)
                         (reduced [v1 v2])
                         v2)))
                   ss)
        [xs ys] ts]
    (apply str (map #(if (= %1 %2) %1 "") xs ys))))
