package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_392 {
    private val production = Production25_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}