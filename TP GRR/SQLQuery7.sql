/****** Script de la commande SelectTopNRows à partir de SSMS  ******/
SELECT TOP 1000 [enseignantId]
      ,[login]
      ,[mp]
      ,[nom]
      ,[prenom]
  FROM [tlutau].[dbo].[enseignant]
  WHERE(nom = 'HENRI')