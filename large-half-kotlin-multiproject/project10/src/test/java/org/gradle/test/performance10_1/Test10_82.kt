package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_82 {
    private val production = Production10_82("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}