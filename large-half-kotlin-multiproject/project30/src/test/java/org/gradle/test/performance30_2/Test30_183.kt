package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_183 {
    private val production = Production30_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}