package org.gradle.test.performance30_1

import org.junit.Assert.*

class Test30_97 {
    private val production = Production30_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}