package org.gradle.test.performance30_1

import org.junit.Assert.*

class Test30_90 {
    private val production = Production30_90("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}