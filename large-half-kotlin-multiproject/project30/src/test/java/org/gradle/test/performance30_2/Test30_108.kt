package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_108 {
    private val production = Production30_108("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}