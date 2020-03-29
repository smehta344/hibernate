package com.mtmm.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmm.entities.Game;
import com.mtmm.entities.Player;
import com.mtmm.helper.SessionFactoryHelper;

public class MTMMTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Player player1 = null;
		Player player2 = null;
		Game game = null;
		Map<Integer, Player> players = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			player1 = new Player();
			player1.setPlayerName("Dhoni");
			player1.setGender("male");
			player1.setAge(38);
			player1.setMobileNo("9999995656");
			player1.setEmailAddress("dhoni@gmail.com");
			session.save(player1);

			player2 = new Player();
			player2.setPlayerName("Rohit");
			player2.setGender("male");
			player2.setAge(32);
			player2.setMobileNo("9696969635");
			player2.setEmailAddress("rohit@gmail.com");
			session.save(player2);

			players = new HashMap<>();
			game = new Game();
			game.setSeriesName("ODI");
			game.setDescription("India vs Pakistan");
			game.setLocation("Mumbai");
			players.put(31, player1);
			players.put(25, player2);
			game.setPlayers(players);
			session.save(game);

			game = (Game) session.get(Game.class, 1);
			System.out.println(game);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			session.close();
		}
		SessionFactoryHelper.close();
	}
}
