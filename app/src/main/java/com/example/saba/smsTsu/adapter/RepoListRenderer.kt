package com.example.saba.smsTsu.adapter

import android.widget.TextView
import com.example.saba.smsTsu.R
import com.facebook.drawee.view.SimpleDraweeView
import com.zuluft.autoadapter.renderables.OrderableRenderer
import com.zuluft.autoadapterannotations.Render
import com.zuluft.autoadapterannotations.ViewField
import com.zuluft.generated.RepoListRendererViewHolder

@Render(layout = R.layout.repo_item,
            views = [
                ViewField(
                    id = R.id.ivListAvatar,
                    name = "avatar",
                    type = SimpleDraweeView::class),
                ViewField(
                    id = R.id.tvListUser,
                    name = "user",
                    type = TextView::class),
                ViewField(
                    id = R.id.tvListName,
                    name = "name",
                    type = TextView::class),
                ViewField(
                    id = R.id.tvListLanguage,
                    name = "language",
                    type = TextView::class),
                ViewField(
                    id = R.id.tvListStars,
                    name = "stars",
                    type = TextView::class)
            ])
class RepoListRenderer : OrderableRenderer<RepoListRendererViewHolder>(){

    override fun areItemsTheSame(p0: OrderableRenderer<*>): Boolean = false

    override fun apply(p0: RepoListRendererViewHolder?){}

    override fun compareTo(p0: OrderableRenderer<*>): Int = 1

    override fun areContentsTheSame(p0: OrderableRenderer<*>): Boolean = false

}
