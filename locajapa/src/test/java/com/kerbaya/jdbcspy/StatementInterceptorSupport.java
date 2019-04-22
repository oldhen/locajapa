/*
 * Copyright 2019 Kerbaya Software
 * 
 * This file is part of locajapa. 
 * 
 * locajapa is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * locajapa is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with locajapa.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.kerbaya.jdbcspy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public class StatementInterceptorSupport<S extends Statement>
		extends WrapperInterceptorSupport<S>
		implements StatementInterceptor<S>
{

	@Override
	public ResultSet executeQuery(S subject, String sql) throws SQLException
	{
		return subject.executeQuery(sql);
	}

	@Override
	public int executeUpdate(S subject, String sql) throws SQLException
	{
		return subject.executeUpdate(sql);
	}

	@Override
	public void close(S subject) throws SQLException
	{
		subject.close();
	}

	@Override
	public int getMaxFieldSize(S subject) throws SQLException
	{
		return subject.getMaxFieldSize();
	}

	@Override
	public void setMaxFieldSize(S subject, int max) throws SQLException
	{
		subject.setMaxFieldSize(max);
	}

	@Override
	public int getMaxRows(S subject) throws SQLException
	{
		return subject.getMaxRows();
	}

	@Override
	public void setMaxRows(S subject, int max) throws SQLException
	{
		subject.setMaxRows(max);
	}

	@Override
	public void setEscapeProcessing(S subject, boolean enable)
			throws SQLException
	{
		subject.setEscapeProcessing(enable);
	}

	@Override
	public int getQueryTimeout(S subject) throws SQLException
	{
		return subject.getQueryTimeout();
	}

	@Override
	public void setQueryTimeout(S subject, int seconds) throws SQLException
	{
		subject.setQueryTimeout(seconds);
	}

	@Override
	public void cancel(S subject) throws SQLException
	{
		subject.cancel();
	}

	@Override
	public SQLWarning getWarnings(S subject) throws SQLException
	{
		return subject.getWarnings();
	}

	@Override
	public void clearWarnings(S subject) throws SQLException
	{
		subject.clearWarnings();
	}

	@Override
	public void setCursorName(S subject, String name) throws SQLException
	{
		subject.setCursorName(name);
	}

	@Override
	public boolean execute(S subject, String sql) throws SQLException
	{
		return subject.execute(sql);
	}

	@Override
	public ResultSet getResultSet(S subject) throws SQLException
	{
		return subject.getResultSet();
	}

	@Override
	public int getUpdateCount(S subject) throws SQLException
	{
		return subject.getUpdateCount();
	}

	@Override
	public boolean getMoreResults(S subject) throws SQLException
	{
		return subject.getMoreResults();
	}

	@Override
	public void setFetchDirection(S subject, int direction) throws SQLException
	{
		subject.setFetchDirection(direction);
	}

	@Override
	public int getFetchDirection(S subject) throws SQLException
	{
		return subject.getFetchDirection();
	}

	@Override
	public void setFetchSize(S subject, int rows) throws SQLException
	{
		subject.setFetchSize(rows);
	}

	@Override
	public int getFetchSize(S subject) throws SQLException
	{
		return subject.getFetchSize();
	}

	@Override
	public int getResultSetConcurrency(S subject) throws SQLException
	{
		return subject.getResultSetConcurrency();
	}

	@Override
	public int getResultSetType(S subject) throws SQLException
	{
		return subject.getResultSetType();
	}

	@Override
	public void addBatch(S subject, String sql) throws SQLException
	{
		subject.addBatch(sql);
	}

	@Override
	public void clearBatch(S subject) throws SQLException
	{
		subject.clearBatch();
	}

	@Override
	public int[] executeBatch(S subject) throws SQLException
	{
		return subject.executeBatch();
	}

	@Override
	public boolean getMoreResults(S subject, int current) throws SQLException
	{
		return subject.getMoreResults(current);
	}

	@Override
	public ResultSet getGeneratedKeys(S subject) throws SQLException
	{
		return subject.getGeneratedKeys();
	}

	@Override
	public int executeUpdate(S subject, String sql, int autoGeneratedKeys)
			throws SQLException
	{
		return subject.executeUpdate(sql, autoGeneratedKeys);
	}

	@Override
	public int executeUpdate(S subject, String sql, int[] columnIndexes)
			throws SQLException
	{
		return subject.executeUpdate(sql, columnIndexes);
	}

	@Override
	public int executeUpdate(S subject, String sql, String[] columnNames)
			throws SQLException
	{
		return subject.executeUpdate(sql, columnNames);
	}

	@Override
	public boolean execute(S subject, String sql, int autoGeneratedKeys)
			throws SQLException
	{
		return subject.execute(sql, autoGeneratedKeys);
	}

	@Override
	public boolean execute(S subject, String sql, int[] columnIndexes)
			throws SQLException
	{
		return subject.execute(sql, columnIndexes);
	}

	@Override
	public boolean execute(S subject, String sql, String[] columnNames)
			throws SQLException
	{
		return subject.execute(sql, columnNames);
	}

	@Override
	public int getResultSetHoldability(S subject) throws SQLException
	{
		return subject.getResultSetHoldability();
	}

	@Override
	public boolean isClosed(S subject) throws SQLException
	{
		return subject.isClosed();
	}

	@Override
	public void setPoolable(S subject, boolean poolable) throws SQLException
	{
		subject.setPoolable(poolable);
	}

	@Override
	public boolean isPoolable(S subject) throws SQLException
	{
		return subject.isPoolable();
	}

	@Override
	public void closeOnCompletion(S subject) throws SQLException
	{
		subject.closeOnCompletion();
	}

	@Override
	public boolean isCloseOnCompletion(S subject) throws SQLException
	{
		return subject.isCloseOnCompletion();
	}

}
