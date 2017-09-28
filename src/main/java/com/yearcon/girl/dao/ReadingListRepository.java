package com.yearcon.girl.dao;

import com.yearcon.girl.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//通过扩展JpaRepository这个接口,ReadingListRepository直接继承了18个常用的持久化操作类----具体请查看spring jpa 的用法
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);//自定义接口,jpa会自动实现(spring data提供了很神奇的魔法,只需要定义接口该接口在运行时就会自动实现)


}
