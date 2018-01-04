package org.gradle.test.performance42_2

import org.junit.Assert.*

class Test42_172 {
    private val production = Production42_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
