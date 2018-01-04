package org.gradle.test.performance30_5

import org.junit.Assert.*

class Test30_469 {
    private val production = Production30_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}