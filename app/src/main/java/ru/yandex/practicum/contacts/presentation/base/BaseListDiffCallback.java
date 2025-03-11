package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull T t, @NonNull T other) {
        return t.theSameAs(other);
        }


    @Override
    public boolean areContentsTheSame(@NonNull T t, @NonNull T other) {
        return t.equals(other);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull T t, @NonNull T other) {
        return other;
    }
}
