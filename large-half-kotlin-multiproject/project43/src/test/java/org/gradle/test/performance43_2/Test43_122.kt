package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_122 {
    private val production = Production43_122("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
