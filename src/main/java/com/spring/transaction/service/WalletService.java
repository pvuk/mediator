package com.spring.transaction.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.spring.transaction.model.Wallet;

public interface WalletService {

	String save(Wallet wallet) throws Exception;

	List<Wallet> saveAll(List<Wallet> wallets) throws Exception;

	String update(Wallet wallet);

	String deleteById(ObjectId walletId);

	Wallet getById(ObjectId walletId);

}
