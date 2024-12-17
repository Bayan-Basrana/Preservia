package com.example.capstone3.Repository;

import com.example.capstone3.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer> {
    Notification findNotificationById (Integer id);
}
