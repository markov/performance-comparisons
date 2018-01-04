package org.gradle.test.performance43_5

import org.junit.Assert.*

class Test43_421 {
    private val production = Production43_421("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
