package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_251 {
    private val production = Production47_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
