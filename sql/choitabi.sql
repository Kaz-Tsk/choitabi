drop database if exists choitabi;
create database  choitabi;
use choitabi;

CREATE TABLE  tour  (
	tour_id INT(11) NOT NULL AUTO_INCREMENT,
	tour_name VARCHAR(100) NULL DEFAULT NULL,
	price DECIMAL(10,0) NULL DEFAULT NULL,
	persons INT(11) NULL DEFAULT NULL,
	departure VARCHAR(100) NULL DEFAULT NULL,
	region VARCHAR(100) NULL DEFAULT NULL,
	prefectures VARCHAR(100) NULL DEFAULT NULL,
	theme VARCHAR(100) NULL DEFAULT NULL,
	comment TEXT NULL,
	img VARCHAR(100) NULL DEFAULT NULL,
	PRIMARY KEY (tour_id)
);


create table cart(
cart_id int not null primary key auto_increment,
user_id int not null,
tour_id int not null,
order_count int not null default 1,
price decimal(10,0) null default null,
registration_date timestamp not null default current_timestamp,
updated_date timestamp not null default current_timestamp,
is_deleted boolean default false,/*商品選択削除*/
purchase_flg int not null default 0,
foreign key(user_id) references openconnect.users(user_id) on delete cascade,
foreign key(tour_id) references choitabi.tour(tour_id) on delete cascade
);

insert into tour(tour_id,tour_name,price,persons,departure,region,prefectures,theme,comment,img)
VALUES
(1,'なみえ焼きそば',1800,0,'福島駅','東北','福島県','グルメ','安い食材でおいしく、お腹いっぱいになれるようにと約５０年前に考えられた浪江町民のソウルフードです。','img/namieyakizoba.jpg'),
(2,'ずんだ餅',1145,0,'宮城駅','東北','宮城県','グルメ','ずんだとは、えだ豆をすりつぶしたもので、かつてえだ豆を打って作ったことから漢字では「豆打」と書きます。甘く味付けし、餅や団子にまぶした「ずんだ餅」が有名で、宮城県や山形県では昔から食べられてきた和菓子です。','img/zundamochi.jpg'),
(3,'アクアマリンふくしま',1800,0,'福島駅','東北','福島県','名所','福島の海の大きな特徴である太平洋の「潮目」をテーマにした水族館です。館内では植物も展示し、生き物が生息する環境を再現しています。メインの潮目の大水槽では、世界初採用の三角トンネルを通りながら、生き物を間近で観察できます。','img/aquamarine_hukusima.jpg'),
(4,'奥入瀬渓流',1145,0,'青森駅','東北','青森県','名所','渓流沿いには散策路が設けられ、川の流れ、苔むした木々などフォトジェニックスポットが満載です。','img/oirasekeiryu.jpg'),
(5,'最上川ラフティング半日コース',7000,0,'山形駅','東北','山形県','アクティビティ','最上川の川沿いの景色を楽しみながら、ラフティングにチャレンジするコースです。','img/mogamigawarafting.jpg'),
(6,'パラグライダータンデムフライト体験',7000,0,'宮城駅','東北','宮城県','アクティビティ','インストラクターと2人乗りで行う、タンデムフライトのパラグライダー体験です。','img/paraglider_tandem_flight.jpg'),
(7,'宇都宮餃子',1481,0,'栃木駅','関東','栃木県','グルメ','地域文化として全国でも名高い「宇都宮餃子」。市内には餃子専門店が多く、”宮っこ”たちは、それぞれひいきの店を持っているそうです。','img/utunomiyagyouza.jpg'),
(8,'よこすか海軍カレー',464,0,'神奈川駅','関東','神奈川県','グルメ','もともとは海軍食で、日本海軍において調理が簡単で栄養バランスが良いメニュー「イギリス海軍のカレーシチュー」を採用し、これにとろみをつけて日本人好みの味に調えご飯にかけて食べるようにしたものとされています。','img/yokosukakaiguncurry.jpg'),
(9,'花貫渓谷',1481,0,'茨木駅','関東','茨城県','名所','渓谷にかかる長さ約60ｍの汐見滝吊り橋からの眺めがすばらしく、特に秋は、川沿いに生い茂る木々の枝が吊り橋の左右からせり出し、華やかな紅葉のトンネルとなります。','img/hananukikeikoku.jpg'),
(10,'日光いろは坂',4649,0,'栃木駅','関東','栃木県','名所','山裾に広がる紅葉を楽しむことができ、標高差もあるので、紅葉前線が下りていく眺めが素晴らしいです。','img/irohazaka.jpg'),
(11,'茂原市ツインサーキット',2500,0,'千葉駅','関東','千葉県','アクティビティ','レーシングカートやポケバイ、ミニバイク、モタード走行が可能な西コースは、子供から大人まで大人気のテクニカルコースです。レンタルカートも乗車できます。','img/mobarashi_twin_circuit.jpg'),
(12,'猿ヶ京バンジー',11000,0,'群馬駅','関東','群馬県','アクティビティ','６２メートルの高さを誇る赤谷水管橋は周りが木々で覆われた渓谷。目の前に迫りくる自然の中、ここで毎年６０００人以上のジャンパー達が達成感を味わっています。','img/sarugakyou_bungee.jpg'),
(13,'大阪の串かつ',555,0,'大阪駅','関西','大阪府','グルメ','大正末期から昭和初期に発祥したといわれ、「トンカツよりも食べやすいものを」と研究された上にうみ出されたもので、牛肉、野菜、魚介類などバラエティーに富んだ素材を串に刺して、揚げたのもです。','img/osakanokusikatsu.jpg'),
(14,'おばんざい',441,0,'京都駅','関西','京都府','グルメ','”おばんざい”とは、京都の庶民が日常に食べている普通のおかずのことで、旬の食材を使って、手間をかけずに作られる料理です。','img/obanzai.jpg'),
(15,'難波八阪神社',5555,0,'大阪駅','関西','大阪府','名所','現在の社殿は戦後に再建されたもので、巨大な獅子頭をかたどった高さ12m、幅11m、奥行10mの絵馬殿はとくに迫力があります。','img/nanbayasakazinja.jpg'),
(16,'龍穏寺',4419,0,'京都駅','関西','京都府','名所','南丹市の山寺でひっそりとではありますが、静かに燃えるような紅葉の落ち葉寺として知る人ぞ知る隠れ名所です。','img/ryouonzi.jpg'),
(17,'淡路島パラセーリング',6000,0,'兵庫駅','関西','兵庫県','アクティビティ','開放感バツグンの上空での空中散歩をお楽しみいただけます。関西ではここでしか体験できない『パラセーリング』で自由な大空へ羽ばたきましょう。','img/awazisima-parasailing.jpg'),
(18,'彦根荒神山ハングライダー体験',7000,0,'滋賀駅','関西','滋賀県','アクティビティ','最新の体験システムで直線100ｍ滑空を体験してもらいます。1日で基本的な操作を習得して頂きます。ハングライダーをコントロール出来る様になりましょう。','img/hikoneshikouzinyama_hang_gliding.jpg'),
(19,'長崎ちゃんぽん',777,0,'長崎駅','九州','長崎県','グルメ','具に野菜、魚介、豚肉をたっぷりと使い、食べ応えがありながらもヘルシーな料理で、そのおいしさが話題となって広まり、現在では長崎県を代表する料理になっています。','img/nagasakichanpon.jpg'),
(20,'観音滝公園',4430,0,'鹿児島駅','九州','鹿児島県','名所','そば打ち体験ができる他見学習館や、薩摩切子の製造過程が見学できるさつま町ガラス工芸館など、楽しい施設が点在しています。','img/kannontakikouen.jpg'),
(21,'御船山学園',7777,0,'佐賀駅','九州','佐賀県','名所','断崖が切り立つ御船山（標高210m）を借景に、イロハカエデやヤマモミジ、オオモミジ、イタヤカエデなど、様々な紅葉を楽しめます。','img/mihuneyamarakuen.jpg'),
(22,'イルカウォッチングツアー',2250,0,'熊本駅','九州','熊本県','アクティビティ','透き通る海にイルカの群れを観る約一時間、船の上からイルカウォッチングできます。','img/iruka_watching_tour.jpg'),
(23,'アロマ&ボタニカルキャンドル',3500,0,'福岡駅','九州','福岡県','アクティビティ','アロマとドライフラワーを閉じ込めた、アロマ＆ボタニカルキャンドル。香りが広がるアロマキャンドルを作りましょう。','img/aroma_botanical_candle.jpg'),
(24,'チキン南蛮',443,0,'宮崎駅','九州','宮崎県','グルメ','衣をつけた鶏肉を揚げ、あつあつのところで甘酢のタレにからめ、タルタルソースをかけて食す全国的に有名なご当地料理です。','img/chickennanban.jpg');