package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_175 {
    private val production = Production43_175("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
