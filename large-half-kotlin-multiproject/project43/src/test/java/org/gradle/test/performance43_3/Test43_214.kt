package org.gradle.test.performance43_3

import org.junit.Assert.*

class Test43_214 {
    private val production = Production43_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
