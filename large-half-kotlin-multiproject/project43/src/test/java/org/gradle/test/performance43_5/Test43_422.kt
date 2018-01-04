package org.gradle.test.performance43_5

import org.junit.Assert.*

class Test43_422 {
    private val production = Production43_422("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
