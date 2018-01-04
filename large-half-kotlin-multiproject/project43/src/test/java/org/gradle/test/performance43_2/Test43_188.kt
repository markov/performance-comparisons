package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_188 {
    private val production = Production43_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
