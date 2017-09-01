/*テストDBにサンプルデータを挿入するコマンドです*/

use test_choitabi;

insert into tour values
('サンプルツアー1', null, 15000, 30, 20170901, 'A駅'),
('サンプルツアー2', null, 15000, 30, 20170901, 'B駅'),
('サンプルツアー3', null, 15000, 30, 20170901, 'C駅');

insert into categories_area values
(null, '東北'),
(null, '関東'),
(null, '関西'),
(null, '九州');


insert into categories_theme values
(null, 'グルメ'),
(null, '名所'),
(null, 'アクティビティ'),
(null, '一押し');