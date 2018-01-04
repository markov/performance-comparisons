package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_255 {
    private val production = Production27_255("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}