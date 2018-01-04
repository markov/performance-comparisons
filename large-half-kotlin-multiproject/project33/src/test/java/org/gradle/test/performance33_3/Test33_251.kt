package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_251 {
    private val production = Production33_251("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}