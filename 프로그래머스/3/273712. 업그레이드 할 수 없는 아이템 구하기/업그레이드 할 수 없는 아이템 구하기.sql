-- 코드를 작성해주세요
SELECT P.ITEM_ID, P.ITEM_NAME, P.RARITY
FROM ITEM_INFO AS P LEFT JOIN ITEM_TREE AS TREE ON P.ITEM_ID = TREE.PARENT_ITEM_ID
WHERE TREE.ITEM_ID IS NULL
ORDER BY P.ITEM_ID DESC