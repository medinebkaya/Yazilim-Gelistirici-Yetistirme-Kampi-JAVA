--Select ile sütun adı seçilir
--From ile tablo adı seçilir
-- select* demek tüm sütunları seçmek demek
--case insensitive yani büyük küçük harf duyarsız


--Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers

-- where ile koşul seçilir
--select* from Customers where City='London'

--select* from Products where CategoryID=1 or categoryId=3

--select* from Products where CategoryID=1 and UnitPrice>=10

--order by sıralama demek (a'dan z ye ya da küçükten büyüğe)
--select* from Products order by ProductName
--select*from Products order by UnitPrice asc
--ascending(artan) --descending(düşen)
--select*from Products order by UnitPrice desc

--sütundaki maddeleri sayma
--select count(*) Adet from Products where CategoryID=2

--group by kullanıldığında yıldız kullanılamaz
--hangi kategoride kaç farkı ürün var ?

--select categoryId,count(*) from Products where UnitPrice>20
--group by CategoryId having count(*)<10

--join birleştirmek
--inner join eşleşen datalar olduğunda kullanılabilir.
select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID
where Products.UnitPrice>10

--left join solda olup sağda olmayanları da getir demek
select* from Products p left join [Order Details] od
on p.ProductID=od.ProductID

select* from Customers c left join Orders o
on c.CustomerID=o.CustomerID
where o.CustomerID is null