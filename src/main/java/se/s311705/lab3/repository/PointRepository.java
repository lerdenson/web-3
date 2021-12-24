package se.s311705.lab3.repository;

import se.s311705.lab3.entity.Point;

import java.util.List;

public interface PointRepository {

    Point addEntity(Point p);

    List<Point> addEntityList(List<Point> pList);

    List<Point> getSessionEntityList();

    List<Point> deleteSessionEntityList();

}
