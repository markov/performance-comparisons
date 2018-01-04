package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_251 {
    private val production = Production30_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}