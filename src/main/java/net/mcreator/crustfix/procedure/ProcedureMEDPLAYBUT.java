package net.mcreator.crustfix.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.crustfix.item.ItemSd9;
import net.mcreator.crustfix.item.ItemSd8;
import net.mcreator.crustfix.item.ItemSd7;
import net.mcreator.crustfix.item.ItemSd6;
import net.mcreator.crustfix.item.ItemSd5;
import net.mcreator.crustfix.item.ItemSd4;
import net.mcreator.crustfix.item.ItemSd3;
import net.mcreator.crustfix.item.ItemSd2;
import net.mcreator.crustfix.item.ItemSd18;
import net.mcreator.crustfix.item.ItemSd17;
import net.mcreator.crustfix.item.ItemSd16;
import net.mcreator.crustfix.item.ItemSd15;
import net.mcreator.crustfix.item.ItemSd14;
import net.mcreator.crustfix.item.ItemSd13;
import net.mcreator.crustfix.item.ItemSd12;
import net.mcreator.crustfix.item.ItemSd11;
import net.mcreator.crustfix.item.ItemSd10;
import net.mcreator.crustfix.item.ItemDisc1;
import net.mcreator.crustfix.item.ItemCrustfix2;
import net.mcreator.crustfix.item.ItemCrustfix;
import net.mcreator.crustfix.ElementsDoorscrustfix;

import java.util.function.Supplier;
import java.util.Map;

@ElementsDoorscrustfix.ModElement.Tag
public class ProcedureMEDPLAYBUT extends ElementsDoorscrustfix.ModElement {
	public ProcedureMEDPLAYBUT(ElementsDoorscrustfix instance) {
		super(instance, 69);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MEDPLAYBUT!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MEDPLAYBUT!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemDisc1.block, (int) (1)).getItem())) {
			if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
				entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return entity.world;
					}

					@Override
					public MinecraftServer getServer() {
						return entity.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return entity.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(entity.posX, entity.posY, entity.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return entity;
					}
				}, "playsound crustfix:unhinged2 ambient @s");
			}
		} else {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd2.block, (int) (1)).getItem())) {
				if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
					entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
						@Override
						public String getName() {
							return "";
						}

						@Override
						public boolean canUseCommand(int permission, String command) {
							return true;
						}

						@Override
						public World getEntityWorld() {
							return entity.world;
						}

						@Override
						public MinecraftServer getServer() {
							return entity.world.getMinecraftServer();
						}

						@Override
						public boolean sendCommandFeedback() {
							return false;
						}

						@Override
						public BlockPos getPosition() {
							return entity.getPosition();
						}

						@Override
						public Vec3d getPositionVector() {
							return new Vec3d(entity.posX, entity.posY, entity.posZ);
						}

						@Override
						public Entity getCommandSenderEntity() {
							return entity;
						}
					}, "playsound minecraft:record.13 ambient @s");
				}
			} else {
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						if (entity instanceof EntityPlayerMP) {
							Container _current = ((EntityPlayerMP) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd3.block, (int) (1)).getItem())) {
					if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
						entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
							@Override
							public String getName() {
								return "";
							}

							@Override
							public boolean canUseCommand(int permission, String command) {
								return true;
							}

							@Override
							public World getEntityWorld() {
								return entity.world;
							}

							@Override
							public MinecraftServer getServer() {
								return entity.world.getMinecraftServer();
							}

							@Override
							public boolean sendCommandFeedback() {
								return false;
							}

							@Override
							public BlockPos getPosition() {
								return entity.getPosition();
							}

							@Override
							public Vec3d getPositionVector() {
								return new Vec3d(entity.posX, entity.posY, entity.posZ);
							}

							@Override
							public Entity getCommandSenderEntity() {
								return entity;
							}
						}, "playsound minecraft:record.cat ambient @s");
					}
				} else {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof EntityPlayerMP) {
								Container _current = ((EntityPlayerMP) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd4.block, (int) (1)).getItem())) {
						if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
							entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return entity.world;
								}

								@Override
								public MinecraftServer getServer() {
									return entity.world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return entity.getPosition();
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(entity.posX, entity.posY, entity.posZ);
								}

								@Override
								public Entity getCommandSenderEntity() {
									return entity;
								}
							}, "playsound minecraft:record.blocks ambient @s");
						}
					} else {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								if (entity instanceof EntityPlayerMP) {
									Container _current = ((EntityPlayerMP) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd5.block, (int) (1)).getItem())) {
							if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
								entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
									@Override
									public String getName() {
										return "";
									}

									@Override
									public boolean canUseCommand(int permission, String command) {
										return true;
									}

									@Override
									public World getEntityWorld() {
										return entity.world;
									}

									@Override
									public MinecraftServer getServer() {
										return entity.world.getMinecraftServer();
									}

									@Override
									public boolean sendCommandFeedback() {
										return false;
									}

									@Override
									public BlockPos getPosition() {
										return entity.getPosition();
									}

									@Override
									public Vec3d getPositionVector() {
										return new Vec3d(entity.posX, entity.posY, entity.posZ);
									}

									@Override
									public Entity getCommandSenderEntity() {
										return entity;
									}
								}, "playsound minecraft:record.chirp ambient @s");
							}
						} else {
							if (((new Object() {
								public ItemStack getItemStack(int sltid) {
									if (entity instanceof EntityPlayerMP) {
										Container _current = ((EntityPlayerMP) entity).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd6.block, (int) (1)).getItem())) {
								if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
									entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
										@Override
										public String getName() {
											return "";
										}

										@Override
										public boolean canUseCommand(int permission, String command) {
											return true;
										}

										@Override
										public World getEntityWorld() {
											return entity.world;
										}

										@Override
										public MinecraftServer getServer() {
											return entity.world.getMinecraftServer();
										}

										@Override
										public boolean sendCommandFeedback() {
											return false;
										}

										@Override
										public BlockPos getPosition() {
											return entity.getPosition();
										}

										@Override
										public Vec3d getPositionVector() {
											return new Vec3d(entity.posX, entity.posY, entity.posZ);
										}

										@Override
										public Entity getCommandSenderEntity() {
											return entity;
										}
									}, "playsound minecraft:record.far ambient @s");
								}
							} else {
								if (((new Object() {
									public ItemStack getItemStack(int sltid) {
										if (entity instanceof EntityPlayerMP) {
											Container _current = ((EntityPlayerMP) entity).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd7.block, (int) (1)).getItem())) {
									if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
										entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
											@Override
											public String getName() {
												return "";
											}

											@Override
											public boolean canUseCommand(int permission, String command) {
												return true;
											}

											@Override
											public World getEntityWorld() {
												return entity.world;
											}

											@Override
											public MinecraftServer getServer() {
												return entity.world.getMinecraftServer();
											}

											@Override
											public boolean sendCommandFeedback() {
												return false;
											}

											@Override
											public BlockPos getPosition() {
												return entity.getPosition();
											}

											@Override
											public Vec3d getPositionVector() {
												return new Vec3d(entity.posX, entity.posY, entity.posZ);
											}

											@Override
											public Entity getCommandSenderEntity() {
												return entity;
											}
										}, "playsound minecraft:record.mall ambient @s");
									}
								} else {
									if (((new Object() {
										public ItemStack getItemStack(int sltid) {
											if (entity instanceof EntityPlayerMP) {
												Container _current = ((EntityPlayerMP) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd8.block, (int) (1)).getItem())) {
										if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
											entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
												@Override
												public String getName() {
													return "";
												}

												@Override
												public boolean canUseCommand(int permission, String command) {
													return true;
												}

												@Override
												public World getEntityWorld() {
													return entity.world;
												}

												@Override
												public MinecraftServer getServer() {
													return entity.world.getMinecraftServer();
												}

												@Override
												public boolean sendCommandFeedback() {
													return false;
												}

												@Override
												public BlockPos getPosition() {
													return entity.getPosition();
												}

												@Override
												public Vec3d getPositionVector() {
													return new Vec3d(entity.posX, entity.posY, entity.posZ);
												}

												@Override
												public Entity getCommandSenderEntity() {
													return entity;
												}
											}, "playsound minecraft:record.mellohi ambient @s");
										}
									} else {
										if (((new Object() {
											public ItemStack getItemStack(int sltid) {
												if (entity instanceof EntityPlayerMP) {
													Container _current = ((EntityPlayerMP) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd9.block, (int) (1)).getItem())) {
											if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
												entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
													@Override
													public String getName() {
														return "";
													}

													@Override
													public boolean canUseCommand(int permission, String command) {
														return true;
													}

													@Override
													public World getEntityWorld() {
														return entity.world;
													}

													@Override
													public MinecraftServer getServer() {
														return entity.world.getMinecraftServer();
													}

													@Override
													public boolean sendCommandFeedback() {
														return false;
													}

													@Override
													public BlockPos getPosition() {
														return entity.getPosition();
													}

													@Override
													public Vec3d getPositionVector() {
														return new Vec3d(entity.posX, entity.posY, entity.posZ);
													}

													@Override
													public Entity getCommandSenderEntity() {
														return entity;
													}
												}, "playsound minecraft:record.stal ambient @s");
											}
										} else {
											if (((new Object() {
												public ItemStack getItemStack(int sltid) {
													if (entity instanceof EntityPlayerMP) {
														Container _current = ((EntityPlayerMP) entity).openContainer;
														if (_current instanceof Supplier) {
															Object invobj = ((Supplier) _current).get();
															if (invobj instanceof Map) {
																return ((Slot) ((Map) invobj).get(sltid)).getStack();
															}
														}
													}
													return ItemStack.EMPTY;
												}
											}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd10.block, (int) (1)).getItem())) {
												if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
													entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
														@Override
														public String getName() {
															return "";
														}

														@Override
														public boolean canUseCommand(int permission, String command) {
															return true;
														}

														@Override
														public World getEntityWorld() {
															return entity.world;
														}

														@Override
														public MinecraftServer getServer() {
															return entity.world.getMinecraftServer();
														}

														@Override
														public boolean sendCommandFeedback() {
															return false;
														}

														@Override
														public BlockPos getPosition() {
															return entity.getPosition();
														}

														@Override
														public Vec3d getPositionVector() {
															return new Vec3d(entity.posX, entity.posY, entity.posZ);
														}

														@Override
														public Entity getCommandSenderEntity() {
															return entity;
														}
													}, "playsound minecraft:record.strad ambient @s");
												}
											} else {
												if (((new Object() {
													public ItemStack getItemStack(int sltid) {
														if (entity instanceof EntityPlayerMP) {
															Container _current = ((EntityPlayerMP) entity).openContainer;
															if (_current instanceof Supplier) {
																Object invobj = ((Supplier) _current).get();
																if (invobj instanceof Map) {
																	return ((Slot) ((Map) invobj).get(sltid)).getStack();
																}
															}
														}
														return ItemStack.EMPTY;
													}
												}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd11.block, (int) (1)).getItem())) {
													if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
														entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
															@Override
															public String getName() {
																return "";
															}

															@Override
															public boolean canUseCommand(int permission, String command) {
																return true;
															}

															@Override
															public World getEntityWorld() {
																return entity.world;
															}

															@Override
															public MinecraftServer getServer() {
																return entity.world.getMinecraftServer();
															}

															@Override
															public boolean sendCommandFeedback() {
																return false;
															}

															@Override
															public BlockPos getPosition() {
																return entity.getPosition();
															}

															@Override
															public Vec3d getPositionVector() {
																return new Vec3d(entity.posX, entity.posY, entity.posZ);
															}

															@Override
															public Entity getCommandSenderEntity() {
																return entity;
															}
														}, "playsound minecraft:record.ward ambient @s");
													}
												} else {
													if (((new Object() {
														public ItemStack getItemStack(int sltid) {
															if (entity instanceof EntityPlayerMP) {
																Container _current = ((EntityPlayerMP) entity).openContainer;
																if (_current instanceof Supplier) {
																	Object invobj = ((Supplier) _current).get();
																	if (invobj instanceof Map) {
																		return ((Slot) ((Map) invobj).get(sltid)).getStack();
																	}
																}
															}
															return ItemStack.EMPTY;
														}
													}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd12.block, (int) (1)).getItem())) {
														if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
															entity.world.getMinecraftServer().getCommandManager()
																	.executeCommand(new ICommandSender() {
																		@Override
																		public String getName() {
																			return "";
																		}

																		@Override
																		public boolean canUseCommand(int permission, String command) {
																			return true;
																		}

																		@Override
																		public World getEntityWorld() {
																			return entity.world;
																		}

																		@Override
																		public MinecraftServer getServer() {
																			return entity.world.getMinecraftServer();
																		}

																		@Override
																		public boolean sendCommandFeedback() {
																			return false;
																		}

																		@Override
																		public BlockPos getPosition() {
																			return entity.getPosition();
																		}

																		@Override
																		public Vec3d getPositionVector() {
																			return new Vec3d(entity.posX, entity.posY, entity.posZ);
																		}

																		@Override
																		public Entity getCommandSenderEntity() {
																			return entity;
																		}
																	}, "playsound minecraft:record.11 ambient @s");
														}
														if (entity instanceof EntityPlayer && !world.isRemote) {
															((EntityPlayer) entity).sendStatusMessage(
																	new TextComponentString("File is damaged. Playing only whole fragment"), (false));
														}
													} else {
														if (((new Object() {
															public ItemStack getItemStack(int sltid) {
																if (entity instanceof EntityPlayerMP) {
																	Container _current = ((EntityPlayerMP) entity).openContainer;
																	if (_current instanceof Supplier) {
																		Object invobj = ((Supplier) _current).get();
																		if (invobj instanceof Map) {
																			return ((Slot) ((Map) invobj).get(sltid)).getStack();
																		}
																	}
																}
																return ItemStack.EMPTY;
															}
														}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd13.block, (int) (1)).getItem())) {
															if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
																entity.world.getMinecraftServer().getCommandManager()
																		.executeCommand(new ICommandSender() {
																			@Override
																			public String getName() {
																				return "";
																			}

																			@Override
																			public boolean canUseCommand(int permission, String command) {
																				return true;
																			}

																			@Override
																			public World getEntityWorld() {
																				return entity.world;
																			}

																			@Override
																			public MinecraftServer getServer() {
																				return entity.world.getMinecraftServer();
																			}

																			@Override
																			public boolean sendCommandFeedback() {
																				return false;
																			}

																			@Override
																			public BlockPos getPosition() {
																				return entity.getPosition();
																			}

																			@Override
																			public Vec3d getPositionVector() {
																				return new Vec3d(entity.posX, entity.posY, entity.posZ);
																			}

																			@Override
																			public Entity getCommandSenderEntity() {
																				return entity;
																			}
																		}, "playsound minecraft:record.wait ambient @s");
															}
														} else {
															if (((new Object() {
																public ItemStack getItemStack(int sltid) {
																	if (entity instanceof EntityPlayerMP) {
																		Container _current = ((EntityPlayerMP) entity).openContainer;
																		if (_current instanceof Supplier) {
																			Object invobj = ((Supplier) _current).get();
																			if (invobj instanceof Map) {
																				return ((Slot) ((Map) invobj).get(sltid)).getStack();
																			}
																		}
																	}
																	return ItemStack.EMPTY;
																}
															}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd14.block, (int) (1))
																	.getItem())) {
																if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
																	entity.world.getMinecraftServer().getCommandManager()
																			.executeCommand(new ICommandSender() {
																				@Override
																				public String getName() {
																					return "";
																				}

																				@Override
																				public boolean canUseCommand(int permission, String command) {
																					return true;
																				}

																				@Override
																				public World getEntityWorld() {
																					return entity.world;
																				}

																				@Override
																				public MinecraftServer getServer() {
																					return entity.world.getMinecraftServer();
																				}

																				@Override
																				public boolean sendCommandFeedback() {
																					return false;
																				}

																				@Override
																				public BlockPos getPosition() {
																					return entity.getPosition();
																				}

																				@Override
																				public Vec3d getPositionVector() {
																					return new Vec3d(entity.posX, entity.posY, entity.posZ);
																				}

																				@Override
																				public Entity getCommandSenderEntity() {
																					return entity;
																				}
																			}, "playsound crustfix:otherside ambient @s");
																}
															} else {
																if (((new Object() {
																	public ItemStack getItemStack(int sltid) {
																		if (entity instanceof EntityPlayerMP) {
																			Container _current = ((EntityPlayerMP) entity).openContainer;
																			if (_current instanceof Supplier) {
																				Object invobj = ((Supplier) _current).get();
																				if (invobj instanceof Map) {
																					return ((Slot) ((Map) invobj).get(sltid)).getStack();
																				}
																			}
																		}
																		return ItemStack.EMPTY;
																	}
																}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd15.block, (int) (1))
																		.getItem())) {
																	if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
																		entity.world.getMinecraftServer().getCommandManager()
																				.executeCommand(new ICommandSender() {
																					@Override
																					public String getName() {
																						return "";
																					}

																					@Override
																					public boolean canUseCommand(int permission, String command) {
																						return true;
																					}

																					@Override
																					public World getEntityWorld() {
																						return entity.world;
																					}

																					@Override
																					public MinecraftServer getServer() {
																						return entity.world.getMinecraftServer();
																					}

																					@Override
																					public boolean sendCommandFeedback() {
																						return false;
																					}

																					@Override
																					public BlockPos getPosition() {
																						return entity.getPosition();
																					}

																					@Override
																					public Vec3d getPositionVector() {
																						return new Vec3d(entity.posX, entity.posY, entity.posZ);
																					}

																					@Override
																					public Entity getCommandSenderEntity() {
																						return entity;
																					}
																				}, "playsound crustfix:pigstep ambient @s");
																	}
																} else {
																	if (((new Object() {
																		public ItemStack getItemStack(int sltid) {
																			if (entity instanceof EntityPlayerMP) {
																				Container _current = ((EntityPlayerMP) entity).openContainer;
																				if (_current instanceof Supplier) {
																					Object invobj = ((Supplier) _current).get();
																					if (invobj instanceof Map) {
																						return ((Slot) ((Map) invobj).get(sltid)).getStack();
																					}
																				}
																			}
																			return ItemStack.EMPTY;
																		}
																	}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd16.block, (int) (1))
																			.getItem())) {
																		if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
																			entity.world.getMinecraftServer().getCommandManager()
																					.executeCommand(new ICommandSender() {
																						@Override
																						public String getName() {
																							return "";
																						}

																						@Override
																						public boolean canUseCommand(int permission, String command) {
																							return true;
																						}

																						@Override
																						public World getEntityWorld() {
																							return entity.world;
																						}

																						@Override
																						public MinecraftServer getServer() {
																							return entity.world.getMinecraftServer();
																						}

																						@Override
																						public boolean sendCommandFeedback() {
																							return false;
																						}

																						@Override
																						public BlockPos getPosition() {
																							return entity.getPosition();
																						}

																						@Override
																						public Vec3d getPositionVector() {
																							return new Vec3d(entity.posX, entity.posY, entity.posZ);
																						}

																						@Override
																						public Entity getCommandSenderEntity() {
																							return entity;
																						}
																					}, "playsound crustfix:rec5 ambient @s");
																		}
																	} else {
																		if (((new Object() {
																			public ItemStack getItemStack(int sltid) {
																				if (entity instanceof EntityPlayerMP) {
																					Container _current = ((EntityPlayerMP) entity).openContainer;
																					if (_current instanceof Supplier) {
																						Object invobj = ((Supplier) _current).get();
																						if (invobj instanceof Map) {
																							return ((Slot) ((Map) invobj).get(sltid)).getStack();
																						}
																					}
																				}
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack((int) (0)))
																				.getItem() == new ItemStack(ItemSd17.block, (int) (1)).getItem())) {
																			if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
																				entity.world.getMinecraftServer().getCommandManager()
																						.executeCommand(new ICommandSender() {
																							@Override
																							public String getName() {
																								return "";
																							}

																							@Override
																							public boolean canUseCommand(int permission,
																									String command) {
																								return true;
																							}

																							@Override
																							public World getEntityWorld() {
																								return entity.world;
																							}

																							@Override
																							public MinecraftServer getServer() {
																								return entity.world.getMinecraftServer();
																							}

																							@Override
																							public boolean sendCommandFeedback() {
																								return false;
																							}

																							@Override
																							public BlockPos getPosition() {
																								return entity.getPosition();
																							}

																							@Override
																							public Vec3d getPositionVector() {
																								return new Vec3d(entity.posX, entity.posY,
																										entity.posZ);
																							}

																							@Override
																							public Entity getCommandSenderEntity() {
																								return entity;
																							}
																						}, "playsound crustfix:hereicome ambient @s");
																			}
																		} else {
																			if (((new Object() {
																				public ItemStack getItemStack(int sltid) {
																					if (entity instanceof EntityPlayerMP) {
																						Container _current = ((EntityPlayerMP) entity).openContainer;
																						if (_current instanceof Supplier) {
																							Object invobj = ((Supplier) _current).get();
																							if (invobj instanceof Map) {
																								return ((Slot) ((Map) invobj).get(sltid)).getStack();
																							}
																						}
																					}
																					return ItemStack.EMPTY;
																				}
																			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSd18.block,
																					(int) (1)).getItem())) {
																				if (!entity.world.isRemote
																						&& entity.world.getMinecraftServer() != null) {
																					entity.world.getMinecraftServer().getCommandManager()
																							.executeCommand(new ICommandSender() {
																								@Override
																								public String getName() {
																									return "";
																								}

																								@Override
																								public boolean canUseCommand(int permission,
																										String command) {
																									return true;
																								}

																								@Override
																								public World getEntityWorld() {
																									return entity.world;
																								}

																								@Override
																								public MinecraftServer getServer() {
																									return entity.world.getMinecraftServer();
																								}

																								@Override
																								public boolean sendCommandFeedback() {
																									return false;
																								}

																								@Override
																								public BlockPos getPosition() {
																									return entity.getPosition();
																								}

																								@Override
																								public Vec3d getPositionVector() {
																									return new Vec3d(entity.posX, entity.posY,
																											entity.posZ);
																								}

																								@Override
																								public Entity getCommandSenderEntity() {
																									return entity;
																								}
																							}, "playsound crustfix:curlightost ambient @s");
																				}
																				if ((((entity instanceof EntityPlayer)
																						? ((EntityPlayer) entity).inventory.hasItemStack(
																								new ItemStack(ItemCrustfix.block, (int) (1)))
																						: false) == (true))) {
																					if (entity instanceof EntityPlayer)
																						((EntityPlayer) entity).inventory.clearMatchingItems(
																								new ItemStack(ItemCrustfix.block, (int) (1))
																										.getItem(),
																								-1, (int) 1, null);
																					if (entity instanceof EntityPlayer) {
																						ItemStack _setstack = new ItemStack(ItemCrustfix2.block,
																								(int) (1));
																						_setstack.setCount(1);
																						ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity),
																								_setstack);
																					}
																					if (entity instanceof EntityPlayer && !world.isRemote) {
																						((EntityPlayer) entity)
																								.sendStatusMessage(
																										new TextComponentString(
																												"What happened to your crustfix?"),
																										(false));
																					}
																				}
																			} else {
																				if (entity instanceof EntityPlayer && !world.isRemote) {
																					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
																							"SD-card is damager or empty or IT'S NOT SD-CARD"),
																							(false));
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
