package spring.project.service;

import java.util.List;

import spring.project.entity.FeedBack;

public interface FeedBackFetchService {
List<FeedBack>getFeedBacks();
FeedBack getFeedBackByid(int id);
}
