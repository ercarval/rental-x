package com.rentalx.shared.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


public abstract class BaseRepository<Entity extends Serializable
									, Id extends Serializable>  {

	private Class<Entity> clazz;
	
	@PersistenceContext
	private EntityManager em;
	
	public BaseRepository( Class<Entity> clazz) {
		this.clazz = clazz;
	}
	
	@Transactional
	public Entity create (Entity entity) {
		em.persist(entity);
		return entity;
	}
	
	@Transactional
	public Entity update (Entity entity) {
		return em.merge(entity);
	}
	
	@Transactional(readOnly=true)
	public Entity findById (Id id) {
		return em.find(clazz, id);
	}
	
	@Transactional(readOnly=true)
	public List<Entity> findAll () {
		return em.createQuery("select c from " + clazz.getName() + " c ", clazz)
				 .getResultList();
	}	
	
	public EntityManager getEntityManager () {
		return em;
	}
	
	
	
	
}
